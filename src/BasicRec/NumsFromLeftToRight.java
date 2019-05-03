package BasicRec;

public class NumsFromLeftToRight {
    public static void main(String[] args) {
        new NumsFromLeftToRight().run(764);
    }

    private void run(int i) {
        System.out.println(getNum(i));
    }

    private String getNum(int i) {
        if (i < 10)
            return Integer.toString(i);
        else
            return getNum(i / 10) + " " + i % 10;
    }
}
