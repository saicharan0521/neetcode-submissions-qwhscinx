class Solution 
{
    public int maxArea(int[] heights) 
    {
        int left =  0;
        int right = heights.length-1;
        int area = -1;
        int max = -1; //max area
        while(left<right)
        {
            max = (right-left)*Math.min(heights[right],heights[left]);
            if(max>area)
            {
                area = max;
            }

            if(heights[right]>heights[left])
            {
                left++;
            }
            else
            {
                right--;
            }
        }  
        return area;      
    }
}
