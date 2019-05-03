package CodeForces;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, h, w = 0;

        n = sc.nextInt();
        h = sc.nextInt();
        for (int i = 0; i < n; i++){
            if (sc.nextInt() > h)
                w += 2;
            else
                w += 1;
        }
        System.out.println(w);
    }
}
