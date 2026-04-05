class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int arr[] = new int[2*nums.length];
        int n = nums.length;
        for(int i=0;i<2*n;i++)
        {
            if(i<n)
                arr[i] = nums[i];
            else
                arr[i] = nums[i-n];
        }

        return arr;

    }
}