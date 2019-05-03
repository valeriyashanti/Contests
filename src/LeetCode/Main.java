
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Character> chars = new ArrayList<>();
    private static Integer result = 0;
    public static String a = "";
    public static String b = "";

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(new File("input.txt")));

            int c;
            while ((c = reader.read()) != -1 && (char)c != ' ') {
                if(c > 47 && c < 58){
                    a += (char)c;
                }
            }
            while ((c = reader.read()) != -1) {
                if ((char)c != ' ')
                    if(c > 47 && c < 58)
                        b += (char)c;
            }
            result = Integer.valueOf(a) + Integer.valueOf(b);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        FileWriter fw = null;
        String str;
        try {
            fw = new FileWriter(new File("output.txt"));
            str = Integer.toString(result);
            fw.write(str);
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    fw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}