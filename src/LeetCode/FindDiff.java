public class FindDiff {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abba", "abbaa"));
    }

    public static char findTheDifference(String s, String t) {
            char[] st = s.toCharArray(), tt = t.toCharArray();
            int res = 0;

            for(int i=0; i < st.length; i++)
                res = res ^ st[i];
            for(int i=0; i < tt.length; i++)
                res = res ^ tt[i];

            return ((char)res);
    }
}


//             int sum = t.charAt(t.length()-1);
//             for (int i = 0; i < s.length(); i++) {
//                 sum += (t.charAt(i) - s.charAt(i));
//             }
//             return (char) sum;
//         }
// }