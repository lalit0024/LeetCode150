import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b


Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"


Constraints:

0 <= nums.length <= 20
-231 <= nums[i] <= 231 - 1
All the values of nums are unique.
nums is sorted in ascending order.
 */


public class SummaryRange {
    public static void main(String[] args) {
    int[] nums = {0,2,3,4,6,8,9};
  //  List<int[]> ranges = new ArrayList<int[]>();
    List<String> ranges= new ArrayList<>();
   int start = 0 ;
   StringBuilder sb ;
     if (nums.length == 1) {
         sb = new StringBuilder();
         sb.append(nums[0]);
         ranges.add(sb.toString());

     }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]-1 != nums[i-1]) {
                sb = new StringBuilder();
                if (nums[start] == nums[i-1]) {
                   sb.append(nums[start]) ;
                }else {
                    sb.append(nums[start]) ;
                    sb.append("->");
                    sb.append(nums[i-1]) ;

                }

                ranges.add(sb.toString());

                start = i;
            }  if (i == nums.length - 1) {
                sb = new StringBuilder();
                if (nums[start] == nums[i]) {
                    sb.append(nums[start]) ;
                }else {
                    sb.append(nums[start]) ;
                    sb.append("->");
                    sb.append(nums[i]) ;
                }
                ranges.add(sb.toString());

            }


        }
    System.out.println(ranges);
    }
}
