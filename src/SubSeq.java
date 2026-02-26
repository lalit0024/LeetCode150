/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

 */


public class SubSeq {

    public static void main(String[] args) {
        String s = "gksre";
        String t = "geeksforgeeks";

       System.out.println(isSubSeq(s, t));

        char[] find = s.toCharArray();
        char[] findInt = t.toCharArray();
        int start = 0;
        int matchCounter =0;
        for (int i = 0; i < find.length; i++) {
            for (int j = start; j < findInt.length; j++) {
                if(find[i] == findInt[j]) {
                    start = j+1;
                    matchCounter++;
                    break;
                }
            }
            if(start ==0) {
                System.out.print("Not a sub Seq..>");
                break;
            }
        }
        if(matchCounter==s.length()) {
            System.out.print("is sub Seq");
        }else {
            System.out.print("Not a sub Seq");
        }
    }

    static boolean isSubSeq(String s , String t) {
        if (s.length() > t.length()) {
            return false;
        }

        int sIndex = 0;
        int tIndex = 0;
        while(sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        if(sIndex==s.length()) {
            return true;
        }
        return false;
    }
}
