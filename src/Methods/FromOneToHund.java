package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class FromOneToHund {
    public static void main(String[] args) {
        new FromOneToHund().run(100, 1);
    }

    private void run(int i, int i1) {
//        printNum(i, i1);
        printNumString(i);
    }

    private void printNumString(int i) {
        Object[] num = new Object[i];
        Arrays.fill(num, new Object(){
            private int count = 0;
            @Override
            public String toString(){
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(num));
    }

    private void printNum(int i, int m) {
        if (i == 1)
            System.out.println(m);
        else {
            System.out.print(m + " ");
            m++;
            printNum(i - 1, m);
        }
    }
}
