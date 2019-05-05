package LeetCode;

public class detectCapitalUse {

    public static void main(String[] args) {
        System.out.println(new detectCapitalUse().detectCapitalUse("USA"));
        System.out.println(new detectCapitalUse().detectCapitalUse("Google"));
        System.out.println(new detectCapitalUse().detectCapitalUse("GooG"));
    }

    public boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;
        char letter = word.charAt(0);
        int upper = 0, lower = 0;
        for (int i = 1; i < word.length(); i++){
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                lower++;
            else
                upper++;
            if (upper > 0 && lower > 0)
                return false;
        }
        if ((letter >= 'A' && letter <= 'Z') || upper == 0)
            return true;
        else
            return false;
    }
}