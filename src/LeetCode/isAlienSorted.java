package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class isAlienSorted {
    public static void main(String[] args) { // решено не до конца - вернусь к нему позже
        System.out.println(new isAlienSorted().isAlienSorted(new String[] {"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
    }
    public boolean isAlienSorted(String[] words, String order) {
        if (words.length < 2) return true;
        Map<Character, Integer> alph = new HashMap<>();
        for (int i = 0; i < order.length(); i++){
            alph.put(order.charAt(i), i + 1);
        }
        int wordSize = 0;
        for (int i = 0; i < words.length; i++){
            wordSize = words[i].length();
            for (int j = 0; j + 1 < words.length; j++){
                if (words[j + 1].length() < wordSize || (alph.get(words[j].charAt(j))) > (alph.get(words[j + 1].charAt(j))))
                    return false;
            }
        }
        return true;
    }
}
