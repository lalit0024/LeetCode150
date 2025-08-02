import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    public static void main(String[] args) {
        Map<Character, Character[]> map = new HashMap<>();
        map.put('2', new Character[] { 'a', 'b', 'c' });
        map.put('3', new Character[] { 'd', 'e', 'f' });
        map.put('4', new Character[] { 'g', 'h', 'i' });
        map.put('5', new Character[] { 'j', 'k', 'l' });
        map.put('6', new Character[] { 'm', 'n', 'o' });
        map.put('7', new Character[] { 'p', 'q', 'r','s'});
        map.put('8', new Character[] {  't', 'u' ,'v'});
        map.put('9', new Character[] { 'w', 'x','y' ,'z'});
        List<String> combinations = new ArrayList<>();
        addCombinations("234",0, combinations, map);
       System.out.println(combinations);


    }
    static void addCombinations(String pattern , int index  , List<String> combinations , Map<Character, Character[]> map) {
        if(index > pattern.length()-1) {
            return ;
        }
        Character[] chars = map.get(pattern.charAt(index));
        if(chars == null) {
            addCombinations(pattern, index + 1, combinations, map);
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
           if(combinations.size() >0) {
            for (int j = 0; j < combinations.size(); j++) {
                String s = combinations.get(j) + Character.toString(chars[i]);
                result.add(s);
            }
           }else {
               result.add(Character.toString(chars[i]));

           }
        }
          combinations.clear();
          combinations.addAll(result);
          addCombinations(pattern, index + 1, combinations, map);
    }
}
