import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
       int[] nums = {1,1,1,2,2,3,3,3,3,3,4,4};
       int dupIndex= 0;
       int movinidex = 1 ;
       for (int i = 1; i < nums.length; i++) {
           if (nums[i] == nums[i-1] && dupIndex <=0) {
               nums[movinidex] = nums[i];
               movinidex++;
               dupIndex++;
           }else if (nums[i] != nums[i-1]) {
               nums[movinidex] = nums[i];
               movinidex++;
               dupIndex=0 ;
           }
       }
       for(int j=movinidex;j<nums.length;j++){
           nums[j] = 0;
       }
       System.out.println(Arrays.toString(nums));

    }
}
