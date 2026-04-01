class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int len = prices.length;
        int[] max = new int[len]; //max = max profits on each day
        max[len-1] = 0;
        int maxprofit = prices[len-1];
        for(int i=len-2;i>=0;i--)
        {
            if(maxprofit<prices[i])
            {
                max[i]=0;
                maxprofit = prices[i];
            }
            else
            {
                max[i]=maxprofit-prices[i];
            }
        }

        int profit=0;
        for(int x:max)
            System.out.print(x+" ");
        for(int i=0;i<len;i++)
        {
            if(profit<max[i])
                profit=max[i];
        }
        return profit;
    }
}
