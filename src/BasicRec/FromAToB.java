package BasicRec;

public class FromAToB {
    private void run(int a, int b) {
        System.out.print(getNums(a, b));
    }

    private String getNums(int a, int b) {

        if (a > b){
            return getNums(a - 1, b) + " " + a;
        }
        else if (b > a)
            return getNums(a , b - 1) + " " + b;
        else
            return a + "";
    }

    public static void main(String[] args) {
        new FromAToB().run(5, -18);
    }
}
