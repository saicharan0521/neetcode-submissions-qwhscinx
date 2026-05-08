class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        combinationSum(nums,target,res,lst,0,0);
        return res;
    }

    public void combinationSum(int[] nums, int target,List<List<Integer>>res,List<Integer>lst,int sum,int indx) 
    {
        if(sum==target)
        {
            res.add(new ArrayList<>(lst));
            return;
        }

        if(sum>target||indx==nums.length)
        {
            return;
        }

        lst.add(nums[indx]);
        combinationSum(nums,target,res,lst,sum+nums[indx],indx);
        lst.remove(lst.size()-1);
        combinationSum(nums,target,res,lst,sum,indx+1);
    }

}
