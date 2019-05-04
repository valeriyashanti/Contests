package Sorts;

import java.util.Arrays;

public class LeetCodeSortedArraysMerge {
    public static void main(String[] args) {
        new LeetCodeSortedArraysMerge().run();
    }

    private void run() {
        int[] a = new int[]{1, 3, 5, 6, 7, 0, 0, 0, 0, 0};
        int[] b =  new int[] {1, 3, 9, 10, 11};
        System.out.println(Arrays.toString(a));
        merge(a, 5, b , 5);
        System.out.println(Arrays.toString(a));

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = m + n - 1;
        m--; n--;
        while (n >= 0) {
            if (m >= 0 && (nums1[m] >= nums2[n]))
                nums1[c--] = nums1[m--];
            else
                nums1[c--] = nums2[n--];
        }
    }
}
