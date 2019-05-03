public class RobotReturnToOrigin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UDLL"));
    }
    public static boolean judgeCircle(String moves) {
        int H=0,V=0;
        for (char c : moves.toCharArray()){
            if (c == 'U')
                V++;
            if (c == 'D')
                V--;
            if (c == 'L')
                H--;
            if (c == 'R')
                H++;
        }
        return (H == 0 && V == 0);
    }

}