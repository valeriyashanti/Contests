package HashTables;

import java.util.*;

public class uncommonFromSentences {
    public static void main(String[] args) {
        new uncommonFromSentences().uncommonFromSentences("this apple is sweet", "this apple is sour");
    }

    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap<>();

        String [] s = A.split(" ");

        for (int i = 0; i <= 1; i++) {
            for (String str : s) {
                if (map.containsKey(str)) {
                    if (map.get(str) != -1)
                        map.put(str, -1);
                } else {
                    map.put(str, 1);
                }
            }
            s = B.split(" ");
        }

        List<String> l = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0){
                l.add(entry.getKey());
            }
        }
        return l.toArray(new String[l.size()]);
    }
}
