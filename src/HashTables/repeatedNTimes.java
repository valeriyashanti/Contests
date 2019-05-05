package HashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class repeatedNTimes {
    public static void main(String[] args) {
        int[] n = {1,2,3,3, 5, 5, 5, 5};

        System.out.println(new repeatedNTimes().repeatedNTimes(n));
        System.out.println(new repeatedNTimes().repeatedNTimesSet(n));

    }

    public int repeatedNTimes(int[] A) {
        int k = A.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k * 2; i++){
            if (map.containsKey(A[i]))
                map.put(A[i], map.get(A[i]) + 1);
            else
                map.put(A[i], 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == k)
                return entry.getKey();
        }

        return k;
    }
    public int repeatedNTimesSet(int[] A) {  // fast beast
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++){
            if (set.contains(A[i]))
                return A[i];
            else
                set.add(A[i]);
        }
        return 0;
    }
}
