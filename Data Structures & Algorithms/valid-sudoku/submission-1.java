class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        // HashMap<Integer,>
        HashSet<Character> row;
        HashSet<Character> col;
        HashMap<String,HashSet<Character>> sqr = new HashMap<>();
        for(int i=0;i<9;i++)
        {
            row = new HashSet<>();
            col = new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    String key = (i/3)+","+(j/3); 
                    sqr.computeIfAbsent(key,k->new HashSet<>());
                    if(row.contains(board[i][j])||
                    sqr.get(key).contains(board[i][j]))
                    {
                        return false;
                    }  

                    row.add(board[i][j]);             
                    sqr.get(key).add(board[i][j]);
                }
                
                if(board[j][i]!='.')    
                { 
                    if(col.contains(board[j][i]))
                        return false;
                    col.add(board[j][i]); 
                }
            }
        }
        return true;
    }
}
