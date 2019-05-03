package Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dups {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        Long num = sc.nextLong();
        int tmp = sc.nextInt();
        System.out.println(tmp);

        for (long i = 0; i < num - 1; i++) {
            int n = sc.nextInt();
            if (tmp != n){
                System.out.println(n);
                tmp = n;
            }
        }
//        new Dups().run();
    }

    private void run() {
        int[] values = {1, 2, 2, 4, 5, 5, 5 ,6, 8, 9, 10, 10, 11, 11, 11, 11, 45 , 45, 45, 45, 45, 45 ,45};
        removeDups(values);
    }

    private void removeDups(int[] values) {
        boolean mask[] = new boolean[values.length];
        int removeCount = 0;

        for (int i = 0; i < values.length; i++){
            if (!mask[i]){
                int tmp = values[i];

                for (int j = i + 1; j < values.length; j++){
                    if (tmp == values[j]){
                        mask[j] = true;
                        removeCount++;
                    }
                }
            }
        }

        int res[] = new int[values.length - removeCount];

        for (int i = 0, j = 0; i < values.length; i++){
            if (!mask[i]){
                res[j++] = values[i];
            }
        }
//        System.out.println(Arrays.toString(res));
    }
}