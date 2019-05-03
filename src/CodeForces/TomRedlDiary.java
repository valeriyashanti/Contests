package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class TomRedlDiary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = valueOf(sc.nextLine());
        HashSet<String> set = new HashSet<>();
        String[] l = new String[n];

        for (int i = 0; i < n; i++){
            l[i] = sc.nextLine();

        }
        for (int i = 0; i < n; i++){
            if (set.contains(l[i]))
                System.out.println("YES");
            else {
                System.out.println("NO");
                set.add(l[i]);
            }
        }
    }
}
