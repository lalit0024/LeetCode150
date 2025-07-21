import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {

        int[] inrarr = {3,2,3,8,8,8,7,7,7,7,7,9,5,5,5,9,9,9,9,9,9,9};

       System.out.println(majorityElement(inrarr));
       Arrays.sort(inrarr);
        int currentDupeValCounter = 0;
        int preDupeValCounter = 0;
        int majDupEl =0;
        for (int x=1; x<inrarr.length; x++){
            System.out.println("comparing" + inrarr[x] + " and " + inrarr[x-1]);
            if (inrarr[x]!=inrarr[x-1]) {
                if(preDupeValCounter < currentDupeValCounter){
                    majDupEl = inrarr[x-1] ;
                    preDupeValCounter = currentDupeValCounter;
                }
                currentDupeValCounter =0 ;
            }
            else {

                currentDupeValCounter++;

                if(x==inrarr.length-1){
                    if(preDupeValCounter < currentDupeValCounter){
                        majDupEl = inrarr[x-1] ;
                    }
                }
              //  majDupEl = inrarr[x] ;


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
