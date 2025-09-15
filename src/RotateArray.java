import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
//        int k= 2 ;
//        int start = nums.length-1 ;
//        int[] helper = new int[k];
//        int j= helper.length-1 ;
//        for (int i = start; i >= k; i--) {
//            if(j>=0) {
//                helper[j] = nums[i];
//            }
//            nums[i] = nums[i-k];
//            j--;
//        }
//        for (int i = 0; i < k; i++) {
//            nums[i] = helper[i];
//        }

        System.out.println(Arrays.toString(nums));
        rotateclockwise(nums,3);
    }

    public static void rotateclockwise(int[] nums, int k) {

        //7-3 =4
        //7-2 =5
        //7-1 =6                      //7,8,9
        int[] nums2 = {1,2,3,4,5,6,7}; //1,2,3
        int[] nums3 = {1,2,3,4,5,6,7}; //1,2,3
        int n = nums.length;
                     //
               // 7+0-2    0.........5  7-3=4
               // 7+1-2     1.........6
               //        2.........7
        // If rotation is greater than array size
        k = k % n;

        //

        // Temporary array to store rotated elements
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < k) {
                // Place last k elements at the beginning
                res[i] = nums[n + i - k];
            }
            else {
                // Shift the rest
                res[i] = nums[i - k];
            }
        }

        // Copy back to original array (in-place update)
        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
