package Sorts;

import test.C;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int [] a = new int[] {2, 4, 5, 6,6, 3, 2, 5, 5, 6, 7, 8,9, 4, 32,3 ,23};
        a  = new CountSort().sort(a);
        System.out.println(Arrays.toString(a));
        int [] b = new int[] {2, 4, 5, 6,6, 3, 2, 5, 5, 6, 7, 8,9, 4, 32,3 ,23};

        b  = new CountSort().sortCount(b);
        System.out.println(Arrays.toString(b));


        CountSort ob = new CountSort();
        char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's'
        };

        ob.sortChars(arr);

        System.out.print("Sorted character array is ");
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]);
    }


    private int[] sort(int[] a) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){
            if (max < a[i])
                max = a[i];
            else if (a[i] < min)
                min = a[i];
        }
        int[] count = new int[max - min + 1];
        int[] b = new int[a.length];

        for (int j = 0; j < a.length; j++){
            count[a[j] - min]++;
        }

        for (int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i - 1];
        }

        for (int j = a.length - 1; j >= 0; j--){
            b[count[a[j] - min] - 1] = a[j];
            count[a[j] - min]--;
        }
        return b;
    }


    private int[] sortCount(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++){
            if (a[i] > max)
                max = a[i];
            else if (a[i] < min)
                min = a[i];
        }
        int[] c = new int[max - min + 1];
        int[] out = new int[a.length];

        for (int i = 0; i < a.length; i++){
            c[a[i] - min]++;
        }

        for (int i = 1; i < c.length; i++){
            c[i] += c[i - 1];
        }

        for (int i = a.length - 1; i >= 0; i--){
            out[c[a[i] - min] - 1] = a[i];
            c[a[i] - min]--;
        }
        return out;
    }

    void sortChars(char []a){
        int n = a.length;
        char[] out = new char[n];
        int c[] = new int[256];

        for (int i = 0; i < 256; ++i)
            c[i] = 0;
        for (int i = 0; i < n; ++i)
            ++c[a[i]];
        for (int i = 1; i < 256; ++i)
            c[i] += c[i - 1];

        for (int i = n - 1; i >= 0; i--){
            out[c[a[i]] - 1] = a[i];
            --c[a[i]];
        }
        for (int i = 0; i < n; i++){
            a[i] = out[i];
        }
    }
}
