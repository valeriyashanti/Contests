package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        HashSet<Character> ch = new HashSet<>();
        for (char c : line.toCharArray()){
            if (c >= 'a' && c <= 'z'){
                ch.add(c);
            }
        }
        System.out.println(ch.size());
    }
}
