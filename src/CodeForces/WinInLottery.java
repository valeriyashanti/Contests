package CodeForces;

import java.util.Scanner;

public class WinInLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), amount = 0;

        while (num > 0){
            if (num >= 100)
                num -= 100;
            else if (num >= 20)
                num -= 20;
            else if (num >= 10)
                num -= 10;
            else if (num >= 5)
                num -= 5;
            else if (num >= 1)
                num -= 1;
            amount++;
        }
        System.out.println(amount);
    }
}
