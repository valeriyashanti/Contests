package CodeForces;

import java.util.Scanner;

public class Capitalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String i = sc.nextLine();
        char c = i.charAt(0);
        if (c >= 'a' && c <= 'z') {
            c = (char) (c - 32);
        }
        System.out.println(c + i.substring(1) + "");
    }
}
