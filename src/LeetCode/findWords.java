package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class findWords {
    public static void main(String[] args) {
        String[] words = {"hello", "Alaska", "Dad", "Peace", "a", "wewqwr" };
        new findWords().findWords(words);
    }

    private final String[] s = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    public String[] findWords(String[] words) {
        Map<Character, Integer> w = new HashMap<>(words.length);
        for (int i = 0; i < 3; i++){
            for (char c : s[i].toCharArray()){
                w.put(c, i + 1);
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            int index = w.get(Character.toLowerCase(words[i].charAt(0)));
            for (char c : words[i].toCharArray()){
                if (index != w.get(Character.toLowerCase(c))){
                    index = -1;
                    break ;
                }
            }
            if (index > 0){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
