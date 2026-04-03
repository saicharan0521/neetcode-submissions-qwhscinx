class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n = piles.length;
        int max = 0;
        int min = 0;
        for(int i=1;i<n;i++)
        {
            if(piles[i]>piles[max])
                max = i;
            if(piles[i]<piles[min])
                min = i;
        }

        int low = 1;
        int high = piles[max];
        int res=Integer.MAX_VALUE;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                sum+=Math.ceil((double)piles[i]/mid);
            }

            System.out.println(sum+" "+mid);

            if(sum<=h&&res>mid)
            {
                res = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }

        return res;
    }
}