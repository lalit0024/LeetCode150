import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.


Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int [][] intervals = {{2,3},{5,5},{2,2},{3,4},{3,4}};
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> list =  merge(intervals, new ArrayList<>());

        int[][] newintervals = new int[list.size()][2];
        for(int j = 0; j < list.size(); j++) {
            newintervals[j] = list.get(j);
            System.out.println(Arrays.toString(newintervals[j]));
        }
         // System.out.println(newintervals);
    }

    static List<int[]> merge(int[][] intervals, List<int[]> list ) {

        list.add(new int []{intervals[0][0],intervals[0][1]});
       for (int j = 1; j < intervals.length; j++) {
          int[] current = intervals[j];
          int[] last = list.get(list.size()-1);
          if(last[1] >= current[0]) {
              last[1] = Math.max(last[1], current[1]);

          }else{
              list.add(current);
          }

       }
      return list;

    }
}
