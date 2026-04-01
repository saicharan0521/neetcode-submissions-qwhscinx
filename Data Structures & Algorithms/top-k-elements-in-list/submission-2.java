class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>();
        for(Integer x:keys)
        {
            values.add(map.get(x));
        }

        Collections.sort
        (keys,(a,b)->
        {
            int x=map.get(a);
            int y=map.get(b);
            if(x!=y)
                return y-x;
            else 
                return 0;
        });
        int res[] = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=keys.get(i);
        }
        return res;
    }
}
