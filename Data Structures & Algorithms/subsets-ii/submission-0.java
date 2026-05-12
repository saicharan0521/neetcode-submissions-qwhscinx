class Solution 
{
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(nums);
        res.add(new ArrayList<>(lst));
        subsetsWithDup(nums,res,lst,0);
        return res;
    }

    public void subsetsWithDup(int[] nums, List<List<Integer>> res,List<Integer> lst,int indx)
    {
        if(indx==nums.length)
            return;

        for(int i=indx;i<nums.length;i++)
        {
            if(i>indx&&nums[i]==nums[i-1])
                continue;
            lst.add(nums[i]);
            res.add(new ArrayList<>(lst));
            subsetsWithDup(nums,res,lst,i+1);
            lst.remove(lst.size()-1);
        }
    } 
}
