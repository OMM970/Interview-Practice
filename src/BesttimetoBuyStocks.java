public class BesttimetoBuyStocks {
    public static int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int MAxprofit = 0;
        while(right<=prices.length-1){
            if(prices[left]>=prices[right]){
                left++;
                right++;
            }
            if(prices[left]<prices[right]){
                int profit = prices[right]-prices[left];
                right++;
                MAxprofit =Math.max(MAxprofit,profit);
            }
        }
        return MAxprofit;
    }
    public static void main(String[] args) {
        System.out.print(maxProfit(new int[]{7,6,4,3,1}));

    }
}
