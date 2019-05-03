package CodeForces;

import java.util.Scanner;

public class Halk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String line = "I hate";

        for (int i = 1; i < num; i++){
            if (i % 2 != 0)
                line += " that I love";
            else
                line += " that I hate";
        }
        line += " it";
        System.out.println(line);
    }
}
