public class Brackets {
    public static void main(String[] args) {
        System.out.println(isParent("{}]"));
    }

    public static boolean isParent(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.equals(""))
                return (false);
            if (s.contains("{}"))
                s = s.replace("{}", "");
            if (s.contains("[]"))
                s = s.replace("[]", "");
            if (s.contains("()"))
                s = s.replace("()", "");
        }
        return (s.equals(""));
    }
}

    // RIGHT ONE

//    public static boolean isValid(String s) {
//        int len = s.length();
//        char []stack = new char[len + 1];
//        int j = 0;
//        if (len == 1)
//            return (false);
//        else if (len == 0)
//            return (true);
//        for (int i=0; i < len; i++){
//            if (isOpen(s.charAt(i))){
//                j++;
//                stack[j] = s.charAt(i);
//            }
//            if (isComplite(stack[j], s.charAt(i))){
//                stack[j--] = 0;
//            }
//            else if(!isOpen(s.charAt(i)) && !isComplite(stack[j], s.charAt(i)))
//            {
//                return (false);
//            }
//
//        }
//        if (isOpen(stack[j])) {
//            return (false);
//        }
//        return (true);
//    }
//
//    public static boolean isComplite(char c, char d){
//        if (c == '{' && d == '}')
//            return (true);
//        if (c == '[' && d == ']')
//            return (true);
//        if (c == '(' && d == ')')
//            return (true);
//        return (false);
//    }
//    public static boolean isOpen(char c){
//        return (c == '{' || c == '(' || c == '[');
//    }
//}


