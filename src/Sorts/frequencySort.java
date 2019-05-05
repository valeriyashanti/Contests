package Sorts;

import org.w3c.dom.Node;

import java.util.*;

public class frequencySort {
    public static void main(String[] args) {
        new frequencySort().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(frequencySort(sc.nextLine()));
    }


    public String frequencySort(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (count.containsKey(c))
                count.put(c, count.get(c) + 1);
            else
                count.put(c, 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> queue =
                new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }
                });

        for (Map.Entry<Character, Integer> entry : count.entrySet()){
            queue.offer(entry);
            if (queue.size() > count.size()){
                queue.poll();
            }
        }

        StringBuilder str = new StringBuilder();
        while (queue.size() > 0){
            char a = queue.peek().getKey();
            int k = queue.poll().getValue();
            for (int i = 0; i < k; i++){
                str.append(a);
            }
        }
        return String.valueOf(str);
    }
}
