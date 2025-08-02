import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {

        int[] arr = {-7, 1, 5, 2, -4, 7, 0};


      System.out.println(  equiIndex(arr));

    }

    static int equiIndex(int[] arr) {

        int leftSum ;
        int rightSum ;
        //Possible equilibrium indexes ..
        for (int i = 1; i < arr.length-1; i++) {
            leftSum =0;
            rightSum=0;
            // Itereate from let till eq index
            for (int j = 0; j < i; j++) {
                leftSum+=arr[j];
            }
              // Iterate from eqi to right
            for (int k = i+1; k < arr.length; k++) {
                rightSum+=arr[k];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }

           return -1;
    }
}
