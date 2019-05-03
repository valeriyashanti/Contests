public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("   - 91283   - 472332"));
    }
    static public int myAtoi(String str) {
        int i = 0, length, n = 0, sign = 1;
        String nS = "";
        length = str.length();
        if (length == 0)
            return (0);
        while (i < length && str.charAt(i) == ' ')
            i++;

        if (i < length && (str.charAt(i) == '-' || str.charAt(i) == '+'))
        {
            if (str.charAt(i) == '-')
                sign = -1;
            i++;
        }
        if (i < length && (str.charAt(i) < '0' || str.charAt(i) > '9'))
            return (0);
        while (i < length){
            if(Character.isDigit(str.charAt(i))){
                nS = nS + str.charAt(i);
            }
            else{
                break;
            }
            i++;
        }
        if(nS.equals("") || nS.equals("-"))
            return (0);
        try{

            n = Integer.valueOf(nS);
        }
        catch(NumberFormatException exc){
            if(sign == -1){

                n = Integer.MIN_VALUE;
            }
            else{
                n = Integer.MAX_VALUE;
            }

        }
        return (n * sign);
    }
}