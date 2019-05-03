package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Anagramm {
    public static void main(String[] args) {
        new Anagramm().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        char[] ac = sc.nextLine().toCharArray();
        Arrays.sort(ac);
        char[] bc = sc.nextLine().toCharArray();
        Arrays.sort(bc);
        if (ac.length < bc.length) {
            System.out.println("0");
            return;
        }
//        for (int i = 0; i < ac.length; i++){
//            if (ac[i] != bc[i]){
//                System.out.println("0");
//                return;
//            }
//        }
        boolean i = Arrays.equals(ac, bc);
        if (i == true)
            System.out.println("1");
        else
            System.out.println("0");
//        System.out.println("1");
    }
}
