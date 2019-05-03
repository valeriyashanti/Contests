package LeetCode;

public class reverseOnlyLetters {
        public static boolean isLetter(char c){
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                return true;
            else
                return false;

        }
        public static String reverseOnlyLetters(String S) {
            int end = S.length() - 1;
            char []arr = S.toCharArray();

            for (int i = 0, j = S.length() - 1; i < j; i++, j--){
                for (;!isLetter(arr[i]) && i < j; i++);
                for (;!isLetter(arr[j]) && i < j; j--);

                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            return new String(arr);
        }

    public static void main(String[] args) {
            new removeDuplicateLetters();
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}
