package CodeForces;

import java.util.Scanner;

public class StringsEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        for (char c : line.toLowerCase().toCharArray()){
            if ((c >= 'a' && c <= 'z')){
                if (c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u' || c == 'i')
                    ;
                else
                    System.out.print("." + c);
            }
        }
    }
}
