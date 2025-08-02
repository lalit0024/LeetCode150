import java.util.ArrayList;
import java.util.List;

public class PermutationString {

    public static void main(String[] args) {
       // Integer[] srcList = {1,2,3,4};
        String input  ="abcd";
        char[] chars = input.toCharArray();
        List<List<Character>> combinations = new ArrayList<>();
         permutations(chars,combinations,0);
         StringBuilder sb ;
         List<String> newcombination = new ArrayList<>();
       for(List<Character> comb : combinations){
           sb = new StringBuilder();
           for(Character c : comb){
               sb.append(c);
           }
           newcombination.add(sb.toString());
       }
       System.out.println(newcombination);
    }
    
    static void permutations (char[] srcList, List<List<Character>> combinations
                              , int startIndex) {
         if  (startIndex >= srcList.length) {
          //   combinations.add(new ArrayList<>(currCombination));
             return;
         }
         if(startIndex ==0){
             List<Character> newcombination = new ArrayList<>();
             newcombination.add(Character.valueOf(srcList[startIndex]));
             combinations.add(newcombination);
              permutations(srcList,combinations,startIndex+1);
              return;
         }
        List<List<Character>> newcombinations  = new ArrayList<>();
         for(List<Character> comb : combinations){
             List<Character>combination ;
             for (int i = 0 ; i<=startIndex ; i++){
                 combination = new ArrayList<>(comb);
                 //combination.addAll(comb);
                 combination.add(i,srcList[startIndex]);
                 newcombinations.add(combination);
             }

         }
         combinations.clear();
         combinations.addAll(newcombinations);
         permutations(srcList,combinations,startIndex+1);

    }
}
