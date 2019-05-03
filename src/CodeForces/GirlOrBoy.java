package CodeForces;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class GirlOrBoy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(GirlBoy(str));
    }

    public static String GirlBoy(String str){
        Set<Character> GB = str.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        if (GB.size() % 2 == 0)
            return ("CHAT WITH HER!");
        else
            return ("IGNORE HIM!");
    }
}