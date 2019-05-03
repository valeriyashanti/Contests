package Methods;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {


//    fibonacci MOD
//
//    private static final int MOD = (int) (1e9+7);
//
//    private int fibonacci(int n){
//        int a = 0, b = 1;
//        for (int i = 0; i < n; i++){
//            int c = (a + b) % MOD;
//            a = b;
//            b = c;
//        }
//        return a;
//    }




// fibonacci plain fast

    private BigInteger fibonacci(int n ){
        BigInteger a = BigInteger.valueOf(0), b = BigInteger.valueOf(1);

        for (int i = 0; i <= n; i++){
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return (a);
    }




//    List<Integer> cache = new ArrayList<>();
//    {
//        cache.add(0);
//        cache.add(1);
//    }
//        private int fibonacci(int n){
//        // 0 ... cache.size - 1
//        // cache.size .... to n
//        for (int i = cache.size(); i <= n; i++){
//            int  res = (cache.get(i - 1) + (cache.get(i - 2))) % MOD;
//            cache.add(res);
//        }
//        return cache.get(n);
//    }







    //    List<BigInteger> cache = new ArrayList<>();
//    {
//        cache.add(BigInteger.ZERO);
//        cache.add(BigInteger.ONE);
//    }
//    private BigInteger fibonacci(int n){
//        // 0 ... cache.size - 1
//        // cache.size .... to n
//        for (int i = cache.size(); i <= n; i++){
//            BigInteger res = cache.get(i - 1).add(cache.get(i - 2));
//            cache.add(res);
//        }
//        return cache.get(n);
//    }






    //    Map<Integer, BigInteger> cache = new HashMap<>();
//    private BigInteger fibonacciMap(int n){
//
//        if (n < 2)
//            return (BigInteger.valueOf(n));
//        if (cache.containsKey(n))
//            return cache.get(n);
//        else {
//            for (int i = 2; i <= n; i++) {
//                BigInteger res = fibonacci(i - 1).add(fibonacci(i - 2));
//                cache.put(i, res);
//            }
//            return cache.get(n);
//        }
//    }

    private void run(int n){
        System.out.println(n + ": " + fibonacci(n));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new Fibonacci().run(10000);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");
    }
}
