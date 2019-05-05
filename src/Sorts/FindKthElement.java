package Sorts;

import java.util.*;

public class FindKthElement {

    public static void main(String[] args) {
        System.out.println(new FindKthElement().topKFrequent(new int[] {3, 4, 5, 1, 6, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7}, 2));
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],  map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k)
                queue.poll();
        }

        List<Integer> i = new ArrayList<>(queue.size());
        while (queue.size() > 0){
            i.add(queue.poll().getKey());
            k--;
        }
        return i;
    }
}
