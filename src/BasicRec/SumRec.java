package BasicRec;

public class SumRec {
    public static void main(String[] args) {
        new SumRec().run(321);
    }

    private void run(int i) {
        System.out.println(getSum(i));
//        System.out.println(getSum2(i));
    }

    private int getSum(int i) {
        if (i < 10)
            return i;
        else
            return i % 10 + getSum(i / 10);
    }

//    private int getSum2(int i) {
//        if (i == 0)
//            return i;
//        else
//            return i + getSum(i - 1);
//    }
}
