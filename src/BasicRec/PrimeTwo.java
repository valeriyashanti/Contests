package BasicRec;

public class PrimeTwo {
    public static void main(String[] args) {
        new PrimeTwo().run(32);
    }

    private void run(int n) {
        System.out.println(primeTwo((float)n));
    }

    private String primeTwo(float n) {
        if (n == 2)
            return "YES";
        else if (n < 2)
            return "NO";
        else
            return primeTwo(n / 2);
    }
}
