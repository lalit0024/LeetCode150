import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
      int n = 4 ;
      int k = 3 ;

        List<List<Integer>> validCombinations = new ArrayList<>();
        List<Integer> srcList = new ArrayList<>();
       for (int i = 1; i <= n; i++) {
           srcList.add(i);
       }
        combinations(srcList,validCombinations,new ArrayList<>(),k,0);
        System.out.println(validCombinations);
    }


    static void combinations(List<Integer> srcList,List<List<Integer>> validCombination, List<Integer> validComb , int target , int index) {
       System.out.println("Index :" + index +" target :" + target + " validComb :" +  validComb  +  " validCombination :" + validCombination);
        if(target == 0){
            validCombination.add(new ArrayList<>(validComb));
            return;
        }
        if(index >= srcList.size()|| target < 0) {
            return;
        }
        validComb.add(srcList.get(index));
        //
         combinations(srcList,validCombination,validComb, target-1, index+1);
         validComb.remove(validComb.size()-1);
         //
        combinations(srcList,validCombination,validComb, target, index+1);

    }
}
