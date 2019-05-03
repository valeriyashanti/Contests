import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(missingNumber2(new int[]{6, 1, 2, 3, 4, 5, 7, 8}));
    }
    public static int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums)
            numSet.add(num);
        for (int n=1; n < nums.length + 1; n++)
            if (!numSet.contains(n))
                return (n);
        return (-1);
    }


    public static int missingNumber2(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++)
            missing ^= i ^ nums[i];
        return (missing);
    }
}


