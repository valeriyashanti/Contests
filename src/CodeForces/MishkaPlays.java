package CodeForces;

import java.util.Scanner;

public class MishkaPlays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rounds = sc.nextInt(), mishka = 0, m = 0, c = 0;
        for (int i = 0; i < rounds; i++){
            m = sc.nextInt();
            c = sc.nextInt();
            if (m > c)
                mishka++;
            else if (m < c)
                mishka--;
        }
        if (mishka > 0)
            System.out.println("Mishka");
        else if (mishka < 0)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
    }
}
