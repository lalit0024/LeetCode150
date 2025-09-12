/*
*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*
 */



public class Palindrome {

    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama" ;
        String s= "0P";
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9A-Za-z]", "");
        char[] chars = s.toCharArray();
        int j = chars.length - 1;
        int i=0 ;
        boolean flag = true;
        while(i<j) {
            if (chars[i] != chars[j]) {
                flag = false;
                System.out.println("not a palindrome");
                break;
            }
            i++;
            j--;

        }
        if(flag){
            System.out.println("a palindrome");
        }


    }


}
