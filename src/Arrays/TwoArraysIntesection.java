package Arrays;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class TwoArraysIntesection {
    public static void main(String[] args) {
        System.out.println(new TwoArraysIntesection().intersection(new int[] {1,2,2,1}, new int[]{2, 2}));
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0)
            return nums1;
        if (nums2.length == 0)
            return nums2;

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        for (int i = 0; i < nums1.length; i++){
            a.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            if (a.contains(nums2[i]))
                b.add(nums2[i]);
        }
        int[] ans = new int[b.size()];
        int i = 0;
        for (Integer integer : b) {
            ans[i++] = integer;
        }
        return ans;
    }
}
