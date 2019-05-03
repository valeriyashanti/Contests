package BasicRec;

public class NumsFromRightToLeft {

    public static void main(String[] args) {
        new NumsFromRightToLeft().run(3435254);
    }

    private void run(int i) {
        getNum(i);
    }

    private int getNum(int i) {
        if (i < 10){
            System.out.print(i);
            return i;
        } else {
            System.out.print(i % 10 + " ");
            return getNum(i / 10);
        }

    }
}
