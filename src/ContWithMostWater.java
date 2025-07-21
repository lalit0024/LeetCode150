public class ContWithMostWater {
    public static void main(String[] args) {
        int [] height = {11,8,6,2,5,4,11,3,7};
        // min height units are counted ....
        //It has to be greedy ..
        int waterUnit = 0;
        int lockedleft = 0;
        int lockedright = 0;
        for (int i = 0; i < height.length; i++) {
            int localWaterUnit = 0;
            for (int j = 0; j < height.length; j++) {
                int distance = 0;
                if (i>j){
                    distance = i-j;
                }else{
                    distance = j-i;
                }
                if(distance>0){
                    if (height[i]<height[j]){
                        localWaterUnit = height[i]*distance ;
                    }else {
                        localWaterUnit =  height[j]*distance ;
                    }
                    if(waterUnit<=localWaterUnit){
                        waterUnit = localWaterUnit ;
                        if (i>j){
                            lockedleft =j;
                            lockedright =i;
                        }else{
                            lockedleft =i;
                            lockedright =j;
                        }

                    }
                }
            }
        }

        System.out.println(waterUnit +"<>"+ height[lockedleft] +"<>"+ height[lockedright] );


    }


}
