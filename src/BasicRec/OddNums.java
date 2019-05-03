package BasicRec;

import java.util.Scanner;

public class OddNums {
    public static void main(String[] args) {
        new OddNums().run();
    }

    private void run() {
        rec();
    }

    private void rec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0){
            if (n % 2 == 1){
                System.out.println(n);
                rec();
            } else {
                rec();
            }
        }
    }
}
