package HyperSkill;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElemArrayIndex {

    public static int findIndexOfLastMax(int[] numbers) {
        // write your code here
        int maxIndex = numbers.length - 1;
        for (int i = numbers.length - 2; i >= 0 ; i--){
            if (numbers[i] > numbers[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers;
        if (scanner.hasNextInt()) {
            numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } else {
            numbers = new int[0];
        }
        System.out.println(findIndexOfLastMax(numbers));
    }
}