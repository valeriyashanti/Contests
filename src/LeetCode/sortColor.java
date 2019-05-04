package LeetCode;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class sortColor {

    public void sortColors(int[] nums) {
        int index = 0, tmp = nums[0];
        int cones = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                nums[index] = 0;
                index++;
            } else if (nums[i] == 1){
                cones++;
            }
        }
        for (int i = index; i < nums.length; i++){
            if (cones > 0){
                nums[i] = 1;
                cones--;
            } else {
                nums[i] = 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,0,2,1,1,0};
        new sortColor().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
