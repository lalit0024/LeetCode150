import java.util.Arrays;

public class FindMissingNumbers {

    public static void main(String[] args) {

        int [] numbers = {3,7,4,8,1,6,5,2,10};
        System.out.println(findMissingNumbers(numbers));
        System.out.println(findMissingNumbers2(numbers));

    }

    static  int findMissingNumbers(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1] -1) {
                return arr[i] +1;
            }
        }
       return -1;
    }

    static  int findMissingNumbers2(int[] arr) {
       int sum = 0;
       int min =Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE ;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(min > arr[i]) {
                min = arr[i];
            }else if(max < arr[i]) {
                max = arr[i];
            }
        }

        return ((max - min)+1)*(min+max)/2- sum;
    }
}
