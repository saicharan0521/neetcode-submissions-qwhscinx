class Solution {
    public boolean searchMatrix(int[][] mat, int tar) 
    {
        int r = mat.length;
        int c =  mat[0].length;
        int row = -1;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][c-1]>=tar)
            {
                row = i;
                break;
            }
        }
        System.out.println(row);
        if(row==-1)
            return false;
        int low = 0;
        int high = c-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(mat[row][mid]==tar)
                return true;
            else if(mat[row][mid]>tar)
                high = mid-1;
            else 
                low = mid+1;
        }
        return false;
    }
}
