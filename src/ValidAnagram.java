import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram" ;
        if(s.length() != t.length()) {
            System.out.println("false");
            return;
        }
        char[] codes = new char[256];
        for (int i = 0; i < s.length(); i++) {
            codes[s.charAt(i)]++;
            codes[t.charAt(i)]--;
        }
        Arrays.sort(codes);
        if(codes[codes.length-1]==0){
            System.out.println("true");
        }else  {
            System.out.println("false");
        }
    }
}
