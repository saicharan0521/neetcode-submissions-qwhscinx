class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        int target=0;
        Set<List<Integer>> wrap = new HashSet<>();
        List<Integer> sub;
        for(int i=0;i<nums.length;i++)
        {
            target = -nums[i];
            int k = nums.length-1;
            int j=i+1;
            sub = new ArrayList<>();
            while(j<k)
            {
                if(nums[k]+nums[j]==target)
                {
                    sub.add(nums[i]);
                    sub.add(nums[j]);
                    sub.add(nums[k]);
                    wrap.add(sub);
                    sub = new ArrayList<>();
                    k--;
                    j++;
                }
                else if(nums[k]+nums[j]>target)
                {
                    k--;
                }
                else if(nums[k]+nums[j]<target)
                {
                    j++;
                }
            }

        }
        return new ArrayList<>(wrap);
    }
}
