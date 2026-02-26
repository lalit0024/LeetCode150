import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {

        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccd";
        String s = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s f";
        char[] chars = pattern.toCharArray();
        String[] words = s.split(" ");
        if (chars.length != words.length) {
            System.out.println("false");
             return ;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map<String , Integer> map2 = new HashMap<String, Integer>();
        for(int i = 0; i < chars.length; i++) {
           if(map.put(chars[i], Integer.valueOf(i)) != map2.put(words[i], Integer.valueOf(i))) {
               System.out.println("false");
               return;
           }
        }
        System.out.println("true");
    }
}
