package LeetCode;

public class toGoatLatin {
    public static void main(String[] args) {
        new toGoatLatin().run();
    }

    private void run() {
//        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

//    public String toGoatLatin(String S) {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < S.length(); i++){
//            char c = S.charAt(i);
//            if (isLetter(c)){
//                while (isVowel(c)){
////                    stringBuilder =
//                }
////                if (ma == 1){
//
//                }
////                while (!isVowel())
//            }
//        }
//    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u'
                || c == 'A' || c == 'O' || c == 'E' || c == 'I' || c == 'U')
            return true;
        else
            return false;
    }

    private boolean isLetter(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return true;
        else
            return false;
    }
}
