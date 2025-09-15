import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4};
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }
}
