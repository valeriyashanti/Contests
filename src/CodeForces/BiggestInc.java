package CodeForces;

import java.util.Scanner;

public class BiggestInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = 0, tmp = 0, next = 0, biggest = 0;
        for (int i = 0; i < n - 1; i++){
            if (tmp == 0)
                tmp = sc.nextInt();
            next = sc.nextInt();
            if (tmp < next) {
                b++;
                if (b > biggest)
                    biggest = b;
            }
            else
                b = 0;
            tmp = next;
        }
        System.out.println(biggest + 1);
    }
}
