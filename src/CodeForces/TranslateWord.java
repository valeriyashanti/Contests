package CodeForces;

import java.util.Scanner;

public class TranslateWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String f = sc.nextLine(), s = sc.nextLine();

        if (f.length() != s.length()) {
            System.out.println("NO");
            return ;
        }

        int j = 0;
        for (int i = f.length() - 1; i >= 0; i--){
            if (f.charAt(i) != s.charAt(j)) {
                System.out.println("NO");
                return;
            }
            j++;
        }
        System.out.println("YES");
    }
}
