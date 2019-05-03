package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class CoinsTwins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count  = sc.nextInt();
        int[] arr = new int[count];
        int total =  0;

        for (int i = 0; i < count; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        Arrays.sort(arr);
        int half = 0;
        int i = 0;
        while (i < count && half <= total/2){
            half = half +  arr[i];
            i++;
        }
        System.out.println(i);

    }
}
