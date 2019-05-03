package CodeForces;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int h = 0, e = 0, l = 0, o = 0;

        for (char c : line.toCharArray()){
            if (c == 'h')
                h++;
            if (c == 'e')
                e++;
            if (c == 'l')
                l++;
            if (c == 'o')
                o++;
        }
        if (e > 0 && o > 0 && l > 1 && h > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
