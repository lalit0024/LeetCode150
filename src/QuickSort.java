import java.util.Arrays;

class QuickSort {

   
   
    // partition function
    static int partition(int[] arr, int low, int high) {
        
        // choose the pivot
        int pivot = arr[high];
        
        // index of smaller element and indicates 
        // the right position of pivot found so far
        int i = low - 1;

        // traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to 
        // i are smaller after every iteration
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        // Move pivot after smaller elements and
        // return its position
        swap(arr, i + 1, high);  
        return i + 1;
    }


    // swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // the QuickSort function implementation
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            
            // pi is the partition return index of pivot
            int pi = partition(arr, low, high);

            // recursion calls for smaller elements
            // and greater or equals elements
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
       // naiveParition(arr);
       lomutoPartion(arr);
        int n = arr.length;
      
      //  quickSort(arr, 0, n - 1);
        
       // System.out.println("Sorted array: " + Arrays.toString(arr));
    }


     static  void naiveParition( int[] arr){
        int length = arr.length;
        int pivot = arr[length - 1];

        int[] temp = new int[length];
        int index = 0;
        int pivotIndex = length - 1;
        for (int i = 0; i < length ; i++) {
            if (arr[i] < pivot) {
               
                temp[index++] = arr[i]; 

            }
        }

         for (int i = 0; i < length ; i++) {
            if (arr[i] == pivot) {
                pivotIndex = index;
                temp[index++] = arr[i]; 

            }
        }

        for (int i = 0; i < length ; i++) {
            if (arr[i] > pivot) {
                temp[index++] = arr[i]; 
            }
        }

        for (int i = 0; i < length; i++) {
            arr[i] = temp[i];
        }   

        System.out.println("After Naive Partitioning:"+ Arrays.toString(arr)  + " Pivot Index: "+ pivotIndex);

     }


     static void lomutoPartion(int[] arr){
          // int[] arr = {10, 7, 8, 9, 1, 5};
          int length = arr.length;
          int pivot = arr[length - 1];

          int trackPivot=0;
         
          for(int i=0; i<length-1; i++){
              if(arr[i] > pivot){
                 // swap(arr, trackLess, i);
                int temp = arr[i];
                arr[i]= pivot;
                arr[length-1] = temp;
                trackPivot = i;
                continue;
                  //swap(arr, trackGreater, i);
              
              }else if(trackPivot != 0 && arr[i] < pivot){
                 int temp = arr[i];
                 arr[i]= arr[trackPivot];
                 arr[trackPivot] = temp;
                 trackPivot = i ;

              }
          }
            System.out.println("After Lomuto Partitioning:"+ Arrays.toString(arr)  + " Pivot Index: "+ trackPivot);
     }
    }