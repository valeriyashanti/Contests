public class JewelsAndStones {
    public static void main(String[] args) {

    }


        public int numJewelsInStones(String J, String S) {
            int count = 0;
            int size1 = J.length();
            int size2 = S.length();
            int i = 0, j;


            while (i < size1) {
                j = 0;
                while (j < size2) {
                    if (J.charAt(i) == S.charAt(j))
                        count++;
                    j++;
                }
                i++;
            }
            return (count);
        }
}
