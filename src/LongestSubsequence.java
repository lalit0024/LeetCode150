public class LongestSubsequence {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(lcsRec(s1, s2 , s1.length(),s2.length()));
    }

    // Returns length of LCS for s1[0..m-1], s2[0..n-1]
    static int lcsRec(String s1, String s2, int sl, int sl2) {
        //String s1 = "AGGTAB";
        //String s2 = "GXTXAYB";
        // Base case: If either string is empty, the length of LCS is 0
        if (sl == 0 || sl2 == 0)
            return 0;

        // If the last characters of both substrings match
        if (s1.charAt(sl - 1) == s2.charAt(sl2 - 1))

            // Include this character in LCS and recur for remaining substrings
            return 1 + lcsRec(s1, s2, sl - 1, sl2 - 1);

        else {
            // If the last characters do not match
            // Recur for two cases:
            // 1. Exclude the last character of S1
            // 2. Exclude the last character of S2
            // Take the maximum of these two recursive calls
          int x = lcsRec(s1, s2, sl, sl2 - 1);
           int y = lcsRec(s1, s2, sl - 1, sl2);
            return Math.max(x,y);
        }
    }
    static int lcs(String s1,String s2){
        int m = s1.length(), n = s2.length();
        return lcsRec(s1,s2,m,n);
    }

}
