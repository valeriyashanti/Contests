package LeetCode;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ContainsDuplicates {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1, 2, 3 , 4 ,5 ,6 ,7 ,8, 9, 1}));
    }
    public static boolean containsDuplicate(int[] nums) {
        return (IntStream.of(nums).boxed().collect(Collectors.toSet()).size() != nums.length);
    }
}