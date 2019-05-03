package CodeForces;

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class LongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 0, count = valueOf(sc.nextLine());

        String [] lines = new String[count];
        for (int i = 0; i < count; i++){
            lines[i] = sc.nextLine();

        }
        for (String s : lines){
            length = s.length();
            if (length > 10)
                System.out.println("" + s.charAt(0) + (length - 2) + s.charAt(length - 1));
            else
                System.out.println(s);
        }
    }
}
