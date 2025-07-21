import java.util.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,8,4,6};
        int grTotalProfit = 0;
        int i =0;
        while(i<prices.length-1){
            int totalProfit =0 ;
            for (int k = i+1; k < prices.length; k++){
                if(prices[k] - prices[i] > totalProfit){
                    totalProfit = prices[k] - prices[i];
                }else {
                    i=k ;
                    break;
                }
                if(k==prices.length-1){
                    i=k;
                }
            }
            grTotalProfit += totalProfit;
        }


        System.out.println("profit " +grTotalProfit);

    }

}
