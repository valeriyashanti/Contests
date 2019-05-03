package LeetCode;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class removeDuplicates {
    public static void main(String[] args) {
        new removeDuplicates().run();
    }

    private void run() {
        int[] a = {1, 1, 1, 2, 4, 5, 6, 6, 6, 7, 8, 9, 9, 10};
        removeDuplicates(a);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return (nums.length);
        int j = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return (j + 1);
    }
}
