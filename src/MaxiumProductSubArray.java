import java.util.ArrayList;
import java.util.List;

public class MaxiumProductSubArray {

    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2} ;
        List<Integer> list = new ArrayList<>();
        int productMax = Integer.MIN_VALUE ;
        int currValue ; ;
       int finalStart = 0 ;
       int finalEnd = 0 ;
        for (int i = 0; i < arr.length; i++) {
            List<Integer> listlocal = new ArrayList<>();
            int start = 0 ;
            int end = 0 ;
            int product = Integer.MIN_VALUE ;
             currValue = arr[i] ;
             listlocal.add(arr[i]);
            for (int j = i+1; j < arr.length; j++) {
                currValue = currValue * arr[j];
                if(product < currValue) {
                    listlocal.add(arr[j]);
                    product = currValue ;
                }else{
                    start = i ;
                    end = j-1 ;
                    break;
                }
            }
             if(productMax < product) {
                 productMax = product ;
                 finalStart = start ;
                 finalEnd = end ;
                 list.clear();;
                 list.addAll(listlocal);
             }
        }

        System.out.println(productMax);
        System.out.println(list);
        System.out.println(finalStart);
        System.out.println(finalEnd);
    }
}
