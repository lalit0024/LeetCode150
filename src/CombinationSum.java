import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
     List<List<Integer>> validCombinations = new ArrayList<>();
     List<Integer> srcList = new ArrayList<>();
        srcList.add(2);
        srcList.add(7);
        srcList.add(6);
        srcList.add(5);
        combinationSum(srcList,validCombinations,new ArrayList<>(),16,0);
        System.out.println(validCombinations);

    }

    static void combinationSum(List<Integer> srcList,List<List<Integer>> validCombination, List<Integer> validComb , int target , int index) {
       if(target == 0){
           validCombination.add(new ArrayList<>(validComb));
           return;
       }
        if(index >= srcList.size()|| target < 0) {
           return;
        }
        validComb.add(srcList.get(index));
        combinationSum(srcList,validCombination,validComb, target-srcList.get(index), index);
        validComb.remove(validComb.size()-1);
        combinationSum(srcList,validCombination,validComb, target, index+1);

    }
}
