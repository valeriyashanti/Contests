import java.util.ArrayList;

public class SingleNumber {

    public static void main(String[] args) {


        int []n = {1, 1, 2 ,3, 4, 3, 4, 2, 7};

        System.out.println(singleNumber(n));
    }
    public static int singleNumber(int[] nums) {
        int size = nums.length, num = 0;
        for (int i=0; i<size; i++){
            num = num ^ nums[i];
        }
        return (num);
    }
}
