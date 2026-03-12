public class ContigousArray {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0};
        System.out.println(findMaxLengthNestedLoop(nums));
        int [] nums2 = {1,-1,0};
        System.out.println(findMaxLengthForK(nums2, 3));
        System.out.println("MyIMP="+findMaxLengthForKArrayCount(nums2, 0));
        System.out.println("GFG="+cntSubarrays(nums2, 0));
    }

    public static int findMaxLengthNestedLoop(int[] nums) {
        int resp = 0;
        for(int i=0;i<nums.length;i++){
           int sum= 0;
            for(int j=i;j<nums.length;j++){
               sum += nums[j] == 0 ? -1 : 1 ;
               if(sum == 0){
                   resp = Math.max(resp, j-i+1);        
            }
        }   
    }
        return resp;   
}

public static int findMaxLengthForK(int[] nums, int k) {
    //1,2,3
    int resp = 0;
        for(int i=0;i<nums.length;i++){
           int sum= 0;
            int temp =i ;
            for(int j=i;j<nums.length;j++){
               sum += nums[j] ;
               if(sum == k){
                   resp = Math.max(resp, j-temp+1);    
                   sum = 0;   
                   temp = j+1 ; 
            }
        }   
    }
        return resp;   

}
public static int findMaxLengthForKArrayCount(int[] nums, int k) {
    //1,2,3
        int resp = 0;
        for(int i=0;i<nums.length;i++){
           int sum= 0 ;
            for(int j=i;j<nums.length;j++){
               sum += nums[j] ;
               if(sum == k){
                   resp++;   
                  // break;   
                  
            }
        }   
       
    }
        return resp;   

}

 public static int cntSubarrays(int[] arr, int k) {
      
        // for maintaining the count of 
        // subarrays whose sum equal to k
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currSum = 0;

            // subarray from i to each j -> arr[i....j]
            for (int j = i; j < n; j++) {
                currSum += arr[j];

                // increment count if the currSum equals k
                if (currSum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}