import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] n = new int[6];
        n[0] = 1;
        n[1] = 3;
        n[2] =  7;
        merge(n, 3, new int[] {2, 5, 7}, 3);
        System.out.println(Arrays.toString(n));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[m+n];

        for (int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}