import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
       int[]  nums = {2,11,7,15};
       int target = 9;
       int[] res = {0,0};
       boolean breakOuter  = false;
       for (int i = 0; i < nums.length-1; i++) {
           for (int j = i+1; j < nums.length; j++) {
                  if (nums[i] + nums[j] == target) {
                      res[0] = i;
                      res[1] = j;
                      breakOuter = true;
                     break;
                  }
           }
           if (breakOuter) {
               break;
           }
       }
       System.out.println(Arrays.toString(res));
    }
}
