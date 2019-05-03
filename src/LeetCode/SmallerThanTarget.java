public class SmallerThanTarget {

    public static void main(String[] args) {
        System.out.println();
    }
        public static char nextGreatestLetter(char[] letters, char target) {
            for (char c: letters)
                if (c > target) return c;
            return letters[0];
        }

    }