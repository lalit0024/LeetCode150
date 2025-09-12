import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {
        int[][] intervals ={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {0,8};
        List<List<Integer>> list = new ArrayList<>();
        int x = 0 ;
        int n = intervals.length;
        List<Integer> temp ;
        // before overlap
            while (x < n && intervals[x][1] < newInterval[0]) {
                temp  = new ArrayList<>();
                temp.add(intervals[x][0]);
                temp.add(intervals[x][1]);
                list.add(temp);
                x++;
            }
            //Overlapp begings
            while(x<n && intervals[x][0] <= newInterval[1]) {
               newInterval[0] = Math.min ( newInterval[0],intervals[x][0]);
               newInterval[1] = Math.max ( newInterval[1],intervals[x][1]);
                x++;

            }
           temp  = new ArrayList<>();
            temp.add( newInterval[0] );
            temp.add( newInterval[1] );
            list.add( temp );

        while(x<n){
            temp  = new ArrayList<>();
            temp.add(intervals[x][0]);
            temp.add(intervals[x][1]);
            list.add(temp);
            x++;
        }


        System.out.println(list);
        int[][] newintervals = new int[list.size()][2];
        for(int j = 0; j < list.size(); j++) {
            newintervals[j][0] = list.get(j).get(0);
            newintervals[j][1] = list.get(j).get(1);
        }
        System.out.println(newintervals);
    }
}
