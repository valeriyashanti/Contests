public class TwoSum {
//
//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.


    public int[] twoSum(int[] nums, int target) {
        int t = 0, j;

        for (int i = 0; i < nums.length; i++){
            j = i + 1;
            while (j < nums.length){
                if (nums[i] + nums[j] == target){
                    return (new int []{i, j});
                }
                j++;
            }
        }
        return (new int []{});
    }
}