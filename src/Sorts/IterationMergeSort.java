package Sorts;

import java.util.Arrays;

public class IterationMergeSort {
    public static void main(String[] args) {
        new IterationMergeSort().run();
    }

    private void run() {
        int [] arr = {1, 4, 76, 6, 43, 3, 8, 5, 2, 43 ,54, 54, 5};
        System.out.println(Arrays.toString(arr));
//        MergeSortRec(arr);
//        System.out.println(Arrays.toString(arr));
        MergeSortIter(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private void MergeSortIter(int[] arr, int n) {
        int curSize, leftStart;

        for (curSize = 1; curSize <= n - 1; curSize = 2 * curSize){
            for (leftStart = 0; leftStart < n - 1; leftStart += 2 * curSize){
                int middle = leftStart + curSize - 1;
                int rightEnd = Math.min(leftStart + 2 * curSize - 1, n - 1);
                merge(arr, leftStart, middle, rightEnd);
            }
        }

    }

    private void merge(int[] arr, int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int [n2];

        for (i = 0; i < n1; i++){
            L[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++){
            R[j] = arr[m + 1 + j];
        }

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1){
            arr[k++] = L[i++];
        }
        while (j < n2){
            arr[k++] = R[j++];
        }
    }

    private void MergeSortRec(int[] arr) {
        if (arr == null) return;
        if (arr.length > 1){
            int middle = arr.length / 2;
            int[] left = new int[middle];
            for (int i = 0; i < middle; i++){
                left[i] = arr[i];
            }

            int[] right = new int[arr.length - middle];
            for (int i = middle; i < arr.length; i++){
                right[i - middle] = arr[i];
            }
            MergeSortRec(left);
            MergeSortRec(right);
            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length){
                if (left[i] < right[j]){
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            while (i < left.length){
                arr[k++] = left[i++];
            }
            while (j < right.length){
                arr[k++] = right[j++];
            }
        }
    }


}
