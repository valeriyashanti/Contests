package CodeForces;

import java.util.Scanner;

public class SolderAndBananas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int money = scanner.nextInt();
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++){
            money = money - (price * i);
        }
        if (money < 0)
            money *= -1;
        else if (money == 0 || money > 0)
            money = 0;
        System.out.println(money);
    }
}
