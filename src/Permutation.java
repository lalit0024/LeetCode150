import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {
        Integer[] srcList = {1,2,3,4};
        List<List<Integer>> combinations = new ArrayList<>();
         permutations(srcList,combinations,0);
        System.out.println(combinations);
    }

    static void permutations (Integer[] srcList, List<List<Integer>> combinations
                              , int startIndex) {
         if  (startIndex >= srcList.length) {
          //   combinations.add(new ArrayList<>(currCombination));
             return;
         }
         if(startIndex ==0){
             List<Integer> newcombination = new ArrayList<>();
             newcombination.add(srcList[startIndex]);
             combinations.add(newcombination);
              permutations(srcList,combinations,startIndex+1);
              return;
         }
        List<List<Integer>> newcombinations  = new ArrayList<>();
         for(List<Integer> comb : combinations){
             List<Integer>combination ;
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
