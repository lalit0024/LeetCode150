public class GasStation {
    public static void main(String[] args) {
        int[]gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
          for (int i = 0; i < gas.length; i++) {
              if (gas[i] > cost[i]) {
                 if( traverse(gas, i, cost ,i) ==i){
                     System.out.println("Start point = "+i);
                     break;
                 }
              }
          }

    }


    static int traverse(int[] gas, int gasIndex, int[] cost , int costIndex) {
        int curGasVal = 0;
        int curGasIndex = gasIndex;
        boolean travel = true  ;
        while (travel) {
         curGasVal +=    gas[curGasIndex] - cost[curGasIndex];
            if(curGasIndex == gas.length-1)  {
                curGasIndex =0 ;
            }else {
                curGasIndex++;
            }

            if (curGasIndex == gasIndex){
                return gasIndex ;
            }
             if (curGasVal <=0){
                 travel = false  ;
             }
        }
        return -1 ;
    }
}
