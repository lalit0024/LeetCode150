import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4};
       int[] res = new int[nums.length];
        int p ;
       for (int i = 0; i < nums.length; i++) {
           p=1;
           for (int j = 0; j < nums.length; j++) {
               if(i!=j){
                   p = p*nums[j];
               }
           }
           res[i]=p;
       }

        System.out.println(Arrays.toString(res));

    }
}
