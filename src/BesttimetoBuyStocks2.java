public class BesttimetoBuyStocks2 {
    public static void main(String[] args) {
        System.out.println(totalProfit2(new int[]{7,1,5,3,6,4}));

    }
    public static  int totalProfit2(int[] prices) {
        int left=0;
        int right=left+1;
        int totalprofit=0;
        while(right<prices.length-1){
            if (prices[left]<prices[right]){
                int profit=prices[right]-prices[left];
                totalprofit+=profit;
            }

            if(prices[right]<prices[right+1] || prices[left]>prices[right]){
                left=right;
            }
            right++;

        }
        return totalprofit;

    }
}
