package BasicRec;

public class AccermanFunc {

    public static void main(String[] args) {
        new AccermanFunc().run(1, 2);
    }

    private void run(int m, int n) {
        System.out.println(acc(m, n));
    }

    private int acc(int m, int n) {
        if (m == 0)
            return n + 1;
        else if (n == 0 && m > 0)
            return acc(m - 1, 1);
        else
            return acc(m - 1, acc(m, n - 1));
    }
}
