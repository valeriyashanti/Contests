import java.util.Arrays;

public class SquaredSortedArray {
    public static void main(String[] args) {
        System.out.println(sortedSquares(new int[] {1, 2, 7, 49 , -7}).length);
    }
        public static int[] sortedSquares(int[] A) {
            int[] nArray = new int[A.length];

            for (int i = 0; i < A.length; i++){
                nArray[i] = A[i] * A[i];
            }
            Arrays.sort(nArray);
            return (nArray);
        }
    }