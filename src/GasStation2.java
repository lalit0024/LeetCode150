class GasStation2 {

    public static void main(String[] args) {
        int[]gas  = {2,3,4};
        int[]cost = {3,4,3};
        System.out.println(canCompleteCircuit(gas, cost));
    }


    static int canCompleteCircuit(int[] gas, int[] cost) {
         for (int i = 0; i < gas.length; i++) {
              if (gas[i] > cost[i]) {
                 if (traverse(gas, i, cost ,i) ==i){
                    return i;
                 };    
              }
          }
          return -1;
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