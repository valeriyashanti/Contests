package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxElem {
    public static void main(String[] args) {
        int[] ints = {1,2,3};
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        System.out.println(maxElem(list));
    }
    public static Integer maxElem(List<Integer> list) {
        int maxElem = 0;
        maxElem = Collections.max(list, null);
        return maxElem;
    }
}