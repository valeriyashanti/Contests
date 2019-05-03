package BasicRec;

public class fromOneToN {

    private void run(int n) {
        System.out.print(getNums(n));
    }

    private String getNums(int n) {

        if (n > 1){
            return getNums(n - 1) + "" + n;
        }
        return "1";
    }

    public static void main(String[] args) {
        new fromOneToN().run(5);
    }
}
