package CodeForces;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase(), b = sc.nextLine().toLowerCase();

        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) < b.charAt(i)) {
                System.out.println("-1");
                return ;
            }
            else if (a.charAt(i) > b.charAt(i)) {
                System.out.println("1");
                return ;
            }
        }
        System.out.println(0);
    }
}
