import java.util.Arrays;

public class TrapRainWater {

    public static void main(String[] args) {

       int[] height = {0,1,0,2,1,0,1,3,2,1,2,1} ;
      // System.out.println(trapRainWater(height));
        System.out.println( maxWater(height));
    }

    static int trapRainWater(int[] height ) {
        int unit = 0 ;
        int[] tempArray = Arrays.copyOf(height, height.length);
        Arrays.sort(tempArray);
        int layer = tempArray[height.length-1];
        for (int i = 1; i <= layer; i++) {
            int[] tempArray2 = new int[height.length];
               for (int j = 0; j < height.length; j++) {
                   tempArray2[j] = height[j]-(layer-i);
                   if(tempArray2[j] <= 0){
                       tempArray2[j] = 0 ;
                   }else {
                       tempArray2[j] = 1 ;
                   }
               }
            unit += caluculateUnits(tempArray2) ;

        }

        return unit;
    }


    static  int caluculateUnits (int[] height) {
        int unit = 0 ;

        //removing left
        for (int i = 0; i < height.length; i++) {
            if (height[i] ==0) {
                unit++;
            }
        }
        //removing right
        for (int i = 0; i < height.length; i++) {
            if (height[i] <=0) {
                unit--;
            }else {
                break;
            }
        }
        for (int j = height.length-1; j >= 0; j--) {
            if (height[j] <=0) {
                unit--;
            }else {
                break;
            }
        }
         if (unit < 0) {
             return 0 ;
         }
        return unit;
    }


    static int maxWater(int[] arr) {
        int res = 0;

        // For every element of the array
        for (int i = 1; i < arr.length - 1; i++) {

            // Find the maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);

            // Find the maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++)
                right = Math.max(right, arr[j]);

            // Update the maximum water
            System.out.println(left + " <--Left, right -->" + right + "arr["+i+"]-- " + arr[i]);
            res += Math.min(left, right) - arr[i];
        }

        return res;
    }
}
