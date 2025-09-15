import java.util.Arrays;

class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {2};
        merge(nums1,0,nums2,1);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int y = n - 1;
        int j = m + n - 1;
        //Merge
        while (i >= 0 && y >= 0) {
            if (nums1[i] < nums2[y]) {
                nums1[j] = nums2[y];
                j--;
                y--;
            } else if (nums1[i] >= nums2[y]) {
                nums1[j] = nums1[i];
                j--;
                i--;
            }
        }
         if (y >= 0) {
             for (i = 0; i <= y; i++) {
                 nums1[i] = nums2[i];
             }
         }
        System.out.println(Arrays.toString(nums1));
    }
}