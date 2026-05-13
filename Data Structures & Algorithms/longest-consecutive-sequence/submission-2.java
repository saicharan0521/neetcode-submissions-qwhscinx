class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int maxc=0; //maxc = maxCount
        int res=0;
        Set<Integer> lst = new HashSet<>();
        for(int x:nums)
        {
            lst.add(x);
        }
        int len = lst.size();
        for(Integer x:lst)
        {
            int val=x;
            if(lst.contains(val-1))
                continue;
            while(lst.contains(val))
            {
                maxc++;
                val++;
            }
            if(res<maxc)
            {
                res = maxc;
            }
            maxc=0;
        } 
        return res; 
    }
}
