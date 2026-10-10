class Solution {
    public int maxProfit(int[] prices) {
        int currentMaxProfit = 0;
        
        int buy = 0;
        int sell = buy + 1;

        while(buy < prices.length-1){
            if((prices[sell] - prices[buy]) > currentMaxProfit){
                currentMaxProfit = (prices[sell] - prices[buy]);
            }

            if(sell == prices.length-1){
                buy++;
                sell = buy+1;
            } else{
                sell++;
            }
        }

        return currentMaxProfit;
        
    }
}
