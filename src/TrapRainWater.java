import java.util.Arrays;

public class TrapRainWater {

    public static void main(String[] args) {

      // int[] height = {4,2,0,3,2,5} ;
      //  int[] height = {0,0,4,0,0,6,0,0,3,0,5,0,1,0,0,0} ;
        int [] height = {3,9,2,2,8,8,7,3};
       System.out.println(trapRainWater(height));
       System.out.println(rainWater(height));
       System.out.println(maxWaterB(height));
       // System.out.println( maxWaterB(height));
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



    static int rainWater(int[] height) {
    //{3,9,2,2,8,8,7,3};
        int lIndex=0;
        int rIndex=1;
        int unit =0;
        int diff = 0 ;
        int diffR = 0 ;
        int length = 0 ;
        int lenthIndex =0 ;
        while (lIndex < height.length-1) {
            if (height[lIndex] <=0) {
                lIndex++;
              //  rIndex++;
            }else {
                if (height[lIndex] <=height[rIndex] && height[rIndex] >0) {
                    unit += (height[lIndex]*((rIndex-lIndex)-1)-(diff+diffR+length));
                    lIndex = rIndex;
                    lenthIndex =0 ;
                    length =0 ;
                    diff =0;
                    diffR =0;

                 //   rIndex++;
                }else {
                    if(height[rIndex] > length){
                        diff +=length ;
                        if(diffR >0){
                            diff+=diffR;
                            diffR =0;
                        }
                        length=height[rIndex] ;
                        lenthIndex = rIndex;;
                    } else {
                        diffR += height[rIndex] ;
                    }
                   // rIndex++;
                }
            }
            if(rIndex == height.length-1){
                if(length !=0 && lenthIndex >0){
                    unit+= (length*((lenthIndex-lIndex)-1)-diff);
                    lIndex = lenthIndex;
                    rIndex =  lIndex+1;
                    diff=0;
                    diffR =0;
                    lenthIndex =0 ;
                    length =0 ;
                }else {
                    break;
                   // lIndex++;
                   // rIndex = lIndex+1;
                }

            }else {
                rIndex++;
            }

        }
        return unit;
    }



    static int maxWaterB(int[] arr) {
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
            res += Math.min(left, right) - arr[i];
        }

        return res;
    }
}
