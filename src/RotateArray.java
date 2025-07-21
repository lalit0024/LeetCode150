import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k= 2 ;
        int start = nums.length-1 ;
        int[] helper = new int[k];
        int j= helper.length-1 ;
        for (int i = start; i >= k; i--) {
            if(j>=0) {
                helper[j] = nums[i];
            }
            nums[i] = nums[i-k];
            j--;
        }
        for (int i = 0; i < k; i++) {
            nums[i] = helper[i];
        }

        System.out.println(Arrays.toString(nums));
        rotateclockwise(nums,2);
    }

    public static void rotateclockwise(int[] arr, int k) {
        int n = arr.length;
        //7-3 =4
        //7-2 =5
        //7-1 =6
        int[] nums = {1,2,3,4,5,6,7};
               // 7+0-2    0.........5
               // 7+1-2     1.........6
               //        2.........7
        // If rotation is greater than array size
        k = k % n;

        // Temporary array to store rotated elements
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < k) {
                // Place last k elements at the beginning
                res[i] = arr[n + i - k];
            }
            else {
                // Shift the rest
                res[i] = arr[i - k];
            }
        }

        // Copy back to original array (in-place update)
        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
    }
}
