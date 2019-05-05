package Search;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(new BinarySearch().search(new int[] {-1,0,3,5,9,12}, 0));
    }
    public int search(int[] nums, int target) {
        if (nums.length > 0){
            int l = 0;
            int r = nums.length - 1;
            while (l <= r){
                int m = l + ((r - l) >> 1);
                if (nums[m] == target)
                    return m;
                else if (target < nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            }
        }
        return -1;
    }
}
