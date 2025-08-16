import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {


        int arr[] = {38, 27, 43, 10};

        mergeSort(arr, 0, arr.length - 1);

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];

        for (int i = 0; i <left.length; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j <right.length; j++) {
            right[j] = arr[mid+1 + j];
        }

        int i = 0 , j=0 ;
        int k = low;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[low + i] = left[i];
                i++;
            }else  {
                arr[low + j] = right[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
