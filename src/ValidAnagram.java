import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram" ;
        if(s.length() != t.length()) {
            System.out.println("false");
            return;
        }
        int[] codes = new int[256];
        for (int i = 0; i < s.length(); i++) {
            codes[s.charAt(i)]++;
            codes[t.charAt(i)]--;
        }
        Arrays.sort(codes);
        int code = codes[codes.length - 1];
        if(code ==0){
            System.out.println("true  " +Character.toString(code));
        }else  {
            System.out.println("false  " +Character.toString(code));
        }
    }
}
