package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement2(new int[]{6,5,6, 5}));
    }
    public static int majorityElement(int[] nums) {
        int num, count, j;

        for (int i=0; i< nums.length; i++){
            num = nums[i];
            j = 0;
            count = 0;
            while (j < nums.length){
                if (nums[j] == num){
                    count++;
                }
                if (count >= nums.length/2 + 1)
                return (nums[i]);
                j++;
            }

        }
        return (-1);
    }
    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}


class MainElement {
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}