public class IsMonotone {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 3, 5}));
    }
        public static boolean isMonotonic(int[] A) {
            if (increase(A) || decrease(A))
                return (true);
            else
                return (false);
        }

        public static boolean increase(int[] a){
            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i] > a[i + 1]){
                    return (false);
                }
            }
            return (true);
        }

        public static boolean decrease(int[] a){
            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i] < a[i + 1]){
                    return (false);
                }
            }
            return (true);
        }
    }