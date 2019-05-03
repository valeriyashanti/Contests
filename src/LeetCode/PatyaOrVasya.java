package LeetCode;

import java.util.Scanner;


public class PatyaOrVasya {
        public static void main(String args[])
        {
            Scanner in = new Scanner(System.in);
            int rounds = in.nextInt();
            int Petya = 0;
            int Vasya = 0;

            while (rounds > 0)
            {
                if (Petya == 0 || Vasya == 0) {
                    if (rounds % 2 == 0)
                        Vasya += in.nextInt();
                    else if (rounds % 3 == 0)
                        Petya += in.nextInt();
                } else {
                    if (Vasya > Petya)
                        Petya += in.nextInt();
                    else
                        Vasya += in.nextInt();
                }
                rounds--;
            }
            if(Petya > Vasya)
                System.out.println("Petya");
            else
                System.out.println("Vasya");
        }
}
