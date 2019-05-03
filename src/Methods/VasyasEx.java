package Methods;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VasyasEx {
    public static void main(String[] args) {
        new VasyasEx().run();

    }

    private void run() {
        System.out.println(nums());
    }

    private int nums() {
        int n = 0, am, skill;
        Scanner sc = new Scanner(System.in);
        am = sc.nextInt();
        skill = sc.nextInt();

        Map<Integer, Integer> arr = new TreeMap<>();

        for (int i = 0; i < am; i++){
            int key = sc.nextInt();
            int level = sc.nextInt();
            if (arr.containsKey(key))
                arr.put(key, arr.get(key) + level);
            else
                arr.put(key, level);
        }

        for (Integer key : arr.keySet()){
            if (key <= skill) {
                int c = arr.get(key);
                n += c;
                skill += c;
            }
        }
        return n;
    }
}
