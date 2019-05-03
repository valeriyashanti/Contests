package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class Pangramma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();

        if (count < 26) {
            System.out.println("NO");
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < count; i++){
            if ((line.charAt(i) >= 'A' && line.charAt(i) <= 'Z'))
                set.add((char)(line.charAt(i) + 32));
            if ((line.charAt(i) >= 'a' && line.charAt(i) <= 'z'))
                set.add(line.charAt(i));
        }
        if (set.size() >= 26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
