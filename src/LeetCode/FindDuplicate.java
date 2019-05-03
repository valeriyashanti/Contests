package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1])
                return (nums[i]);
        }
        return (-1);
    }
}


class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}
