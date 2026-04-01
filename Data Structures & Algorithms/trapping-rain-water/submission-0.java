class Solution {
    public int trap(int[] h) 
    {
        int len = h.length;
        int lmax = 0;
        int rmax = 0;
        int tot = 0;
        int l = 0;
        int r = len-1;

        while(l<r)
        {
            lmax = Math.max(h[l],lmax);
            rmax = Math.max(h[r],rmax);
            if(lmax<rmax)
            {
                tot+=lmax-h[l];
                l++;
            }

            else
            {
                tot+=rmax-h[r];
                r--;
            }
        }  

        return tot;
    }
}
