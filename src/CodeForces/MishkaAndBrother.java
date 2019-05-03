package CodeForces;

import java.util.Scanner;

public class MishkaAndBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), b = sc.nextInt(), years = 0;

        while (true){
            if (m > b){
                System.out.println(years);
                return ;
            }
            years++;
            m *= 3;
            b *= 2;
        }
    }
}
