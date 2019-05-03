package CodeForces;

import java.util.Scanner;

public class UraAndSettlement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, num = 0, free = 0, total = 0;

        count = sc.nextInt();
        for (int i = 0; i < count; i++){
            free = sc.nextInt();
            total = sc.nextInt();
            if (total - free >= 2)
                num++;
        }
        System.out.println(num);
    }
}
