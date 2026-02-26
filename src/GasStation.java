public class GasStation {
    public static void main(String[] args) {
        int[]gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
                int n = gas.length;;

                int startIdx = 0;

                // Initially tank is empty
                int currGas = 0;

                for (int i = 0; i < n; i++) {
                    currGas = currGas + gas[i] - cost[i];

                    // If currGas becomes less than zero, then
                    // It's not possible to proceed with this startIdx
                    if (currGas < 0) {
                        startIdx = i + 1;
                        currGas = 0;
                    }
                }

                  int gasIndex = startIdx;
                  int remainingGas = 0 ;
                  for (int j = 0; j < n; j++) {
                       remainingGas = remainingGas+gas[(gasIndex+j)%n]-cost[(j+gasIndex)%n];
                      if(remainingGas < 0)  {
                          System.out.println("No route");
                          break;
                      }

                  }
              System.out.println(gasIndex);


    }


}
