import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aac";
        String magazineNote = "aab";

        int[] codes = new int[256];
        char[] chars = ransomNote.toCharArray();
        char[] magazineChars = magazineNote.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            codes[chars[i]]++;
        }
        for (int i = 0; i < magazineChars.length; i++) {
            codes[magazineChars[i]]--;
        }
        Arrays.sort(codes);
       if(codes[codes.length-1] !=0) {
           System.out.println("false");
       }else  {
           System.out.println("true");
       }
    }
}
