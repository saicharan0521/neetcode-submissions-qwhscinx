class Solution 
{
    public List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        res.add(new ArrayList<>(lst));
        subsets(nums,0,res,lst);
        return res;
    }

    public void subsets(int[] nums,int indx,List<List<Integer>> res,List<Integer>lst)
    {
        if(indx==nums.length)
            return;
        lst.add(nums[indx]);
        res.add(new ArrayList<>(lst));
        subsets(nums,indx+1,res,lst);
        lst.remove(lst.size()-1);
        subsets(nums,indx+1,res,lst);
    }
}


