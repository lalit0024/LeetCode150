import java.util.Arrays;

class MergeSortedArray {


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] nums3  = new int [m+n] ;
          boolean swap = true  ; 
          int pointernums2 = n-1 ;
          int pointerNums1 = m-1 ;
          int finalPointer = m+n-1 ;

          while (swap) {
              System.out.println(pointernums2 +"<==>"+pointerNums1  +"<==>"+finalPointer  );
           if (nums1[pointerNums1] >= nums2[pointernums2]){
                nums1[finalPointer] =nums1[pointerNums1] ;
                  nums3[finalPointer] =nums1[pointerNums1] ;
                nums1[pointerNums1] =0 ;

                finalPointer-- ;
               if(pointerNums1 != 0){
                   pointerNums1-- ;
               }


            } else if (nums1[pointerNums1] < nums2[pointernums2]){
                nums1[finalPointer] =nums2[pointernums2] ;
                  nums3[finalPointer] =nums2[pointernums2] ; ;
                finalPointer-- ;
                if(pointernums2 != 0){
                    pointernums2--;

                }

            }  else  if (finalPointer== 0){

                  swap = false  ;
              }


          }

        System.out.print(Arrays.toString(nums1));
        System.out.print(Arrays.toString(nums3));
    }
}