import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        Integer[] srcList = {1,2,3};
        List<List<Integer>> subsets = new ArrayList<>();


        subSet(srcList,0,subsets);
       System.out.println(subsets);

    }


    static void subSet(Integer[] mainSet, int startIndex,List<List<Integer>> subsets) {

        if (startIndex >= mainSet.length) {
           /// subsets.add(new ArrayList<>(currentSet));
       // System.out.println(subsets);
            return;
        }
        if (startIndex == 0) {
            /// subsets.add(new ArrayList<>(currentSet));
            List<Integer> subList = new ArrayList<>();
            List<Integer> emptyList = new ArrayList<>();
            subsets.add(emptyList);
            subList.add(mainSet[startIndex]);
            subsets.add(subList);
            subSet(mainSet, startIndex+1,subsets);;
            return;
        }

        List<List<Integer>> permutations = new ArrayList<>();
        permutations.addAll(subsets);
        List<Integer> newSets ;
       for(List<Integer> subset : subsets) {
           newSets = new ArrayList<>();
           newSets.addAll(subset);
           newSets.add(mainSet[startIndex]);
           permutations.add(newSets);
       }
        List<Integer> currntNum = new ArrayList<>();
        currntNum.add(mainSet[startIndex]);
       permutations.add(currntNum);
        subsets.clear();
        subsets.addAll(permutations);
       subSet(mainSet, startIndex+1,subsets);



    }
}

