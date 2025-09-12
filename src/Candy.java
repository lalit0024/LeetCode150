import java.util.Arrays;
/*
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.



Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.


Constraints:

n == ratings.length
1 <= n <= 2 * 104
0 <= ratings[i] <= 2 * 104
 */
public class Candy {
    public static void main(String[] args) {
      int[] ratings = {3,2,1};
      int candy = 0;
      int length = ratings.length;
      // Compare with left side
        int[] leftCount  =  new int[length];
        Arrays.fill(leftCount, 1);
        for(int i = length-1; i > 0; i--) {
            if(ratings[i] < ratings[i-1]) {
                leftCount[i-1] = leftCount[i-1] + leftCount[i];
            }
        }
      //Compare with right side
        int[] rightCount =  new int[length];
        Arrays.fill(rightCount, 1);
        for(int i = 0; i < length-1; i++) {
            if(ratings[i] < ratings[i+1]) {
                rightCount[i+1]= rightCount[i+1] + rightCount[i];
            }

        }


       for (int x =0 ;  x < length; x++) {
             candy = candy + Math.max(leftCount[x],rightCount[x]);
       }
       System.out.println(candy);
    }





}
