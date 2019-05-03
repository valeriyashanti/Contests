package CodeForces;

import java.util.Scanner;

public class Slonik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), i = 0;

        while (x > 0){
            x -= 5;
            i++;
        }
        System.out.println(i);
    }
}
