import java.util.*;
import java.io.*;

public class FromFile{ //имя класса должно быть Main
    public static void main(String[] argv) throws IOException{
        new FromFile().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        int a=sc.nextInt(), b=sc.nextInt();

        pw = new PrintWriter(new File("output.txt"));
        pw.print(a+b);
        pw.close();
    }
}