import java.util.ArrayList;
import java.util.List;

public class FindCommon {
    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"helllllo", "howlll", "hoholll"}));
    }
    public static List<String> commonChars(String[] A) {
        List<String> Answer = new ArrayList<>();

        int WC;
        for (char c = 'a'; c <= 'z'; c++) {
            int MC = Integer.MAX_VALUE;
            for (String s : A){
                WC = 0;
                for (char ch : s.toCharArray()){
                    if (c == ch)
                        WC++;
                }
                MC = Math.min(MC, WC);
            }
            for (int i = 0; i < MC; i++){
                Answer.add(c + "");
            }
        }
        return (Answer);
    }
}
