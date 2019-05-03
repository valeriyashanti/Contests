public class findDuplicates {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5}));
    }
    public static boolean containsDuplicate(int[] nums) {

        for (int d : nums){
//            if (nums.contains(d))
                return (true);
        }
        return (false);
    }
}