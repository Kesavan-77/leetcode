class Solution {
    public int maxProfit(int[] prices) {
        int start=0;
        int end = 1;
        int res = 0;
        while(end < prices.length){
            if(prices[end]<prices[start]) start = end;
            else res = Math.max(prices[end] - prices[start], res);
            end++;
        }
        return res;
    }
}