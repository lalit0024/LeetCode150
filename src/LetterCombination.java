import java.util.*;

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
       System.out.println( addCombinations("123",0, new ArrayList<>(), map));

    }
    static List<String> addCombinations(String pattern , int index  , List<String> comb , Map<Character, Character[]> map) {
        if(index > pattern.length()-1) {
            return comb;
        }
        Character[] chars = map.get(pattern.charAt(index));
        if(chars == null) {
           return addCombinations(pattern, index + 1, comb, map);
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
           if(comb.size() >0) {
            for (int j = 0; j < comb.size(); j++) {
                String s = comb.get(j) + Character.toString(chars[i]);
                result.add(s);
            }
           }else {
               result.add(Character.toString(chars[i]));

           }
        }
        return addCombinations(pattern, index + 1, result, map);
    }
}
