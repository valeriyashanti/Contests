package DataStructs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InversionNums {
    public static void main(String[] args) throws FileNotFoundException {
        new InversionNums().run();
    }

//    private int[] Merge(int[] a, int[] b){
//        int i = 0, j = 0;
//        int[] res = new int[a.length + b.length];
//        for (int n = 0; n < res.length; n++){
//            i
//        }
//    }

    private void run() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

    }
}
