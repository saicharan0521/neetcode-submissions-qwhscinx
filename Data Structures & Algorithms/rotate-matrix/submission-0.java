class Solution {
    public void rotate(int[][] mat) 
    {
        int n = mat.length;
        for(int i=0;i<n/2;i++)
        {
            for(int j = 0;j<mat[0].length;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[n-i-1][j];
                mat[n-i-1][j] = temp;
            }    
        }

        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
