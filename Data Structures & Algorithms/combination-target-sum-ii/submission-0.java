class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> lst = new ArrayList<>();
        combinationSum2(candidates,target,res,lst,0,0);
        return res;
    }

    public void combinationSum2(int[] arr, int target,List<List<Integer>> res,List<Integer>lst,int sum,int indx)
    {
        if(sum==target)
        {
            res.add(new ArrayList<>(lst));
            return;
        }
        if(sum>target||indx==arr.length)
        {
            return;
        }

        for(int i=indx;i<arr.length;i++)
        {
            if(i>indx&&arr[i]==arr[i-1])
            {
                continue;
            }

            lst.add(arr[i]);
            combinationSum2(arr,target,res,lst,sum+arr[i],i+1);
            lst.remove(lst.size()-1);
        }
    }
}
