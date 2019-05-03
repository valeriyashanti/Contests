package BasicRec;

import java.util.Scanner;

public class NumsOfOnes {

    public static void main(String[] args) {
        new NumsOfOnes().run();
    }

    private void run() {
        System.out.println(rec());
    }

    private int rec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1){
            int m = sc.nextInt();
            if (m == 1)
                return rec() + n + m;
            else {
                int k = sc.nextInt();
                if (k == 1)
                    return rec() + n + m + k;
                else
                    return n + m + k;
            }
        } else {
            int m = sc.nextInt();
            if (m == 1)
                return rec() + n + m;
            else
                return n + m;
        }
    }
}
