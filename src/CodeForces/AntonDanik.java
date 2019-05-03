package CodeForces;

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class AntonDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, n = valueOf(sc.nextLine());
        String line  = sc.nextLine();

        for (char c : line.toCharArray()){
            if (c == 'A')
                count++;
            else if (c == 'D')
                count--;
        }
        if (count < 0)
            System.out.println("Danik");
        else if (count > 0)
            System.out.println("Anton");
        else
            System.out.println("Friendship");
    }
}
