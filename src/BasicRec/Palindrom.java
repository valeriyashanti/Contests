package BasicRec;

public class Palindrom {
    public static void main(String[] args) {
        new Palindrom().run("abbbnbbba");
    }

    private void run(String s) {
        System.out.println(ifPal(s));
    }

    private String ifPal(String s) {
        if (s.length() == 1)
            return "YES";
        else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))){
                if (s.length() == 2)
                    return "YES";
                return ifPal(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
}
