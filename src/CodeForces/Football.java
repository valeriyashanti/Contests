package CodeForces;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zero = 0, one = 0;
        String line = sc.nextLine();
        for (char c : line.toCharArray()){
            if (c == '0'){
                zero++;
                one  = 0;
            }
            else if (c == '1') {
                one++;
                zero = 0;
            }
            if (zero >= 7 || one >= 7) {
                System.out.println("YES");
                return ;
            }
        }
         System.out.println("NO");
    }
}
