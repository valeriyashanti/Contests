package Contest;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class GenerateBrackets {
    public static void main(String[] args) throws FileNotFoundException {
        new GenerateBrackets().run();
    }

    private void run() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        generate(num);
//        generateRec(num);
    }

    private void generateRec(int num) {
        num *= 2;
        int count = 0, index = 0;

        char[] arr = new char[num];

        getBreckets(count, index, num, arr);
    }

    private void getBreckets(int count, int index, int num, char[] arr) {
        if (count <= num - index - 2){
            arr[index] = '(';
            getBreckets(count + 1, index + 1, num, arr);
        }
        if (count > 0){
            arr[index] = ')';
            getBreckets(count - 1, index + 1, num, arr);
        }

        if (index == num)
            if (count == 0)
                System.out.println(valueOf(arr));
    }


    private void generate(int num) throws FileNotFoundException {
        int count, index;
//        ArrayList<String> sArray = new ArrayList<>();
        PrintWriter printWriter = new PrintWriter(new File("input.txt"));
        num *= 2;
        char []arr = new char[num];

        for (int i = 0; i < num; i++){
            if (i < num / 2)
                arr[i] = '(';
            else
                arr[i] = ')';
        }

//        sArray.add(valueOf(arr));
        printWriter.println(valueOf(arr));
//        System.out.println(sArray.iterator());
        while (true){
            index  = num - 1;
            count = 0;
            while (index >= 0){
                if (arr[index] == ')')
                    count--;
                if (arr[index] == '(')
                    count++;
                if (count < 0 && arr[index] == '(')
                    break;
                index--;
            }
            if (index < 0)
                break;
            arr[index] = ')';

            for (int i = index + 1; i < num; i++){
                if (i <= (num - index +count) / 2 + index)
                    arr[i] = '(';
                else
                    arr[i] = ')';
            }
//            sArray.add(valueOf(arr));
            printWriter.println(valueOf(arr));
        }
    }
}
