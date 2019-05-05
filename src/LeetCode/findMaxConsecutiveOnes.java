package LeetCode;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(new findMaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] {1,0, 1, 1, 0, 1, 0 ,1}));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, biggest = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1)
                count++;
            else
                count = 0;

            if (count > biggest)
                biggest = count;
        }
        return biggest;
    }
}
