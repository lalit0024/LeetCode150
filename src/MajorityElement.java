import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {3,2,3,8,8,8,7,7,7,7,7,9,5,5,5,9,9,9,9,9,9,9,8,8,8,8,8,8,8,8,8,8,8};
        int[] nums2 = {2,2,1,1,1,2,2};
      System.out.println(majorityElement(nums2));
       Arrays.sort(nums);
        int currentDupeValCounter = 0;
        int preDupeValCounter = 1;
        int majDupEl =0;
        if(nums.length==1){
            return;
        }
        for (int x=1; x<nums.length; x++){
            if (nums[x]!=nums[x-1] && preDupeValCounter < currentDupeValCounter) {
                preDupeValCounter = currentDupeValCounter;
                currentDupeValCounter =0 ;
                majDupEl = nums[x-1] ;
            }
            else {
                currentDupeValCounter++;
              //  majDupEl = inrarr[x] ;
            }
            if(x==nums.length-1 && preDupeValCounter< currentDupeValCounter){
                 majDupEl = nums[x-1] ;

            }
        }

        System.out.println(majDupEl);




    }


    static int majorityElement(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        // Potential majority element
        int candidate = arr[n/2];

        // Count how many times candidate appears
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n/2) {
            return candidate;
        }
        // No majority element
        return -1;
    }
}
