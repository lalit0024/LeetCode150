import java.util.Arrays;
/*
Implementing merge sort ...
 */
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 10};
         mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr , int start, int end) {

        if (start >= end) {
           return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);



    }

    static void merge(int[] arr, int left, int mid, int right) {

        int[] tempArray = new int[right - left + 1];
        int i=left ;
        int j=mid + 1 ;
        int k=0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tempArray[k] = arr[i];
                i++;
            }else  {
                tempArray[k] = arr[j];
                j++;
            }
            k++;
        }
         if (j <= right) {
             while (j <= right) {
                 tempArray[k] = arr[j];
                 j++;
             }
         }
         if(i<=mid){
             tempArray[k] = arr[i];
             i++;
         }

        for(int x=0;x<tempArray.length;x++){
            arr[left] = tempArray[x];
            left ++;
        }

    }

}
