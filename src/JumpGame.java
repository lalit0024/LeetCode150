import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JumpGame {

    /*
    You are given an integer array nums. You are initially positioned at the array's first index,
    and each element in the array represents your maximum jump length at that position.
    Return true if you can reach the last index, or false otherwise.
    Example 1:
    Input: nums = [2,3,1,1,4]
    Output: true
    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
    Example 2:
    Input: nums = [3,2,1,0,4]
    Output: false
    Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0,
    which makes it impossible to reach the last index.

     */
    public static void main(String[] args) {
        int[] nums = {3,4,3,2,5,4,3};
        boolean[] canReach = new boolean[nums.length];
         // System.out.println(traverse(nums,0,0, canReach));
        System.out.println(greedyMinJump(nums));
        // System.out.println( greedy(nums));
      //  List<Integer> jumps = new ArrayList<>();
      //  traverse2(nums, 0, jumps, 0);
       // System.out.println(minJump(nums,0,0,-1));
//        System.out.println(Arrays.toString(pr));
//        int[] processed = new int[nums.length];
//        System.out.println(traverse2(nums, 0,processed));
//        System.out.println(Arrays.toString(processed));

    }



    static boolean traverse(int[] nums , int jumpindex ,int prevIndex, boolean[] jumps) {
      if(jumps[jumpindex]){
          return true;
      }
        if(jumpindex>=nums.length-1){
            System.out.println( jumpindex);
            jumps[prevIndex] = true;
            return true;
        }

        int val = nums[jumpindex];

        if(val==0 && jumpindex<nums.length-1){
            return false;
        }
        while(val>0){
            if(traverse(nums, jumpindex+val,jumpindex, jumps))

            return true;
            ;
            val--;
        }
         return  false ;
    }

    static void traverse2(int[] nums , int jumpindex, List<Integer> jumps, int jump) {
//{2,4,4,0,0,1,4};

        if(jumpindex>=nums.length-1){
            jumps.add(jump);
            return ;
        }
        int val = nums[jumpindex];
        if(val==0 && jumpindex<nums.length-1){
            return ;
        }

        while(val>0){
            traverse2(nums, jumpindex+val, jumps , jump+1);
           // jump--;
            val--;
        }

        return;
    }

    static int minJump(int[] nums , int jumpindex,  int jump , int minJump) {
        if(jumpindex>=nums.length-1){
           if(minJump<0 || jump<minJump){
               minJump = jump;
           }

            return minJump;
        }
        int val = nums[jumpindex];
        if(val==0 && jumpindex<nums.length-1){
            return minJump;
        }

        while(val>0){
            minJump = minJump(nums, jumpindex+val, jump+1 ,minJump);
            // jump--;
            val--;
        }

        return minJump;
    }


    static boolean greedy(int[] nums ){
        int start = nums.length-2;
        int reach =  nums.length-1;
        for(int i=start;i>=0;i--){
            if(nums[i]+(i) >= reach){
                reach =  i;
            }
        }
        if(reach==0){
            return true;
        }
        return false;
    }


    static int greedyMinJump(int[] num ){
        if(num.length ==1){
            return 0 ;
        }

      int jump = 0;
      int currP =0  ;
      int maxReach =0 ;
      int maxReachIndex =0;
        for(int i=0;i<num.length;i++){

            if(currP + num[currP] >= num.length-1) {
                return jump + 1;
            }
            if(i> currP+ num[currP]){
                currP =  maxReachIndex;
                jump++ ;
            }
            int currReach = num[i]+i ;
            if(currReach>= maxReach){
                maxReach =  currReach;
                maxReachIndex = i;
            }
            if(maxReachIndex==num.length-1){
                jump++;
                break;
            }



        }


       return jump;
    }
}
