import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
       int[]  nums = {2,7,11,15};
       int target = 9;
       System.out.println("Nested Loop 0(n^2):" + Arrays.toString(twoSumUnordered(nums, target)));
       System.out.println("Two Pointers 0(n):" + Arrays.toString(twoSumOrdered(nums, target)));
       System.out.println("HashMap 0(n):" + Arrays.toString(twoSumHashMap(nums, target)));
       learnArrays();
    }

  // 1. Nested Loop O(n^2)
    private static int[] twoSumUnordered(int[] nums, int target) {
            for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i,j};
                    }
            }       
        }
        return new int[0];

    }

    // 2. Two Pointers O(n) - Only works if the array is sorted
     private static int[] twoSumOrdered(int[] nums, int target) {
    

         int i =0;
         int j = nums.length-1;
         while (i<j) {              
             int sum = nums[i] + nums[j];
             if (sum == target) {
                 return new int[]{i,j};
             } else if (sum < target) {
                 i++;
             } else {
                 j--;
             }
            }   
        return new int[0];

    }

    private static int[] twoSumHashMap(int[] nums, int target) {
        // Implementing using HashMap for O(n) time complexity
        // This method is not implemented in the current code but can be added for completeness
         int[] result = new int[2];
         Map<Integer, Integer> map = new HashMap<>();
           for(int i = 0 ; i < nums.length;i++){
              int complement = target - nums[i];
              if(map.containsKey(complement)){
                    result[0] = map.get(complement);
                    result[1] = i;
                    return result;
              }
              map.put(nums[i]  , i);
           }
        return new int[0];
    }




    private static void learnArrays() { 
       
        int[] nums = {1, 2, 3, 4, 5,12,11,56,78};
         System.out.println("Sorted Array: " + Arrays.toString(nums));
        Integer [] nums2 = Arrays.stream(nums).boxed().sorted((a, b) -> b-a

        ).toArray(Integer[]::new);
        System.out.println("Sorted Array 1: " + Arrays.toString(nums2));
        Arrays.sort(nums2 ,Collections.reverseOrder()); 
        System.out.println("Sorted Array 2: " + Arrays.toString(nums2));

    }

}
