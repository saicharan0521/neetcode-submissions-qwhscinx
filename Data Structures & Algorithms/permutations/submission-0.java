class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        boolean[] vis = new boolean[21];
        permute(nums,vis,res,lst,0);
        return res; 
    }

    public void permute(int[] nums,boolean[] vis,List<List<Integer>> res,List<Integer> lst,int indx)
    {
        if(lst.size()==nums.length)
        {
            res.add(new ArrayList<>(lst));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!vis[10+nums[i]])
            {
                lst.add(nums[i]);
                vis[10+nums[i]] = true;
                permute(nums,vis,res,lst,indx+1);
                vis[10+nums[i]] = false;
                lst.remove(lst.size()-1);
            }
        }
    } 
}