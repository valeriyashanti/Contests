package LeetCode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.String.valueOf;

public class removeDuplicateLetters {
    public static void main(String[] args) {

        new removeDuplicateLetters().run();
    }

    private String run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        TreeSet<Character> set = new TreeSet<>();


        for (char c : s.toCharArray()){
            if (!set.contains(c))
                set.add(c);
        }
        // System.out.println(valueOf(set));

        return (valueOf(set).toCharArray().toString());
    }
}
