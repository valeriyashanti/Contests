package Contest;

import java.util.Scanner;

public class MultipleOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), count = 0, biggest = 0, tmp = -1, n;

        for (int i = 0; i < num; i++){
            n = sc.nextInt();
            if (n == 1){
                count++;
                if (count > biggest)
                    biggest = count;
            }
            else
                count = 0;
        }
        System.out.println(biggest);
    }
}