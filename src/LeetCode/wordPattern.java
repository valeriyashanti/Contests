package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class wordPattern {

    public static void main(String[] args) {

        System.out.println(new wordPattern().wordPattern("aaaa",
                "dog dog dog dog"));
    }


    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if (pattern.length() != s.length) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++){
            if (!map.containsKey(pattern.charAt(i)) && !map.containsKey(getKey(map, s[i]))){
                map.put(pattern.charAt(i), s[i]);
            } else {
                if (!map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(s[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
