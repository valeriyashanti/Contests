package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacterInaString {
    public static void main(String[] args) {
        new FirstUniqueCharacterInaString().run();
    }

    private void run() {
        System.out.println(getFirstIndex("lllll"));
    }

    private int getFirstIndex(String s) {
        int index = -1;

        byte[] b = s.getBytes();
        HashMap<Byte, Integer> a = new HashMap<>();

        for (int i = 0; i < b.length; i++){
            if (a.containsKey(b[i])){
                a.put(b[i], a.get(b[i]) + 1);
            } else {
                a.put(b[i], 0);
            }
        }
        for (int i = 0; i < b.length; i++){
            if (a.get(b[i]) == 0)
                return i;
        }
        return index;
    }

    public int firstUniqChar(String s) {
        int freq [] = new int[26];

        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }



}



