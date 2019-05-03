public class ToLowerCase {


    public static void main(String[] args) {
        System.out.println(toLowerCase("HELLO"));
    }
        public static String toLowerCase(String str) {
        String string = "";
            int size = str.length();
            int index = 0;
            while (index < size)
            {
                if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                    string = string + (char)(str.charAt(index) + 32);
                }
                else {
                    string += str.charAt(index);
                }
                index++;
            }
            return (string);
        }
}
