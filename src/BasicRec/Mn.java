package BasicRec;

public class Mn {
    public static void main(String[] args) {
        new Mn().run(150, 4);
    }

    private void run(int n, int m){
        getMns(n, m);
    }

    private void getMns(int n, int m) {
        if (m > n / 2){
            System.out.print(n);
            return;
        }
        if (n % m == 0){
            System.out.print(m + "*");
            getMns(n / m, m);
        }
        else
            getMns(n, ++m);
    }
}
