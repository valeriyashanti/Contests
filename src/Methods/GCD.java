package Methods;

public class GCD {

//    Recursive method
//    private long gcdREC(long a, long b){
//        if (a == 0) return b;
//        if (b == 0) return a;
//        if (a >= b)
//            return gcd(a % b, b);
//        else
//            return gcd(a, b % a);
//    }

        private long gcd(long a, long b){
            while (true) {
                if (a == 0) return b;
                if (b == 0) return a;
                if (a >= b)
                    a %= b;
                else
                    b %= a;
            }
    }


    private void run(){
        System.out.println(gcd(324234234L * 166, 324234234233L * 166));
        System.out.println(gcd(1L, 0L));

    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new GCD().run();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");
    }
}
