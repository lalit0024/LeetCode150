import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat dog cat";
        char[] chars = pattern.toCharArray();
        String[] words = s.split(" ");
        if (chars.length != words.length) {
            System.out.println("false");
        }
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
               if(!map.get(chars[i]).equals(words[i])){
                  System.out.println("false");
                   return;
               }
            }else{
                map.put(chars[i], words[i]);
            }
        }
        System.out.println("true");
    }
}
