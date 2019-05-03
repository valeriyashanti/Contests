public class MountainArray {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int [] {1, 3, 4, 5 ,6, 7, 0}));
    }
    public static int peakIndexInMountainArray(int[] A) {
        int t, b =0;
        if (A.length == 0)
            return (0);
        t = A[0];
        for (int i = 1; i < A.length; i++){
            if (t < A[i]){
                t = A[i];
                b = i;
            }
        }
        return (b);
    }
}