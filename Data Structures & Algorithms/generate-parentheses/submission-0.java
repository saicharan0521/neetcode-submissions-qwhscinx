class Solution 
{
    public List<String> generateParenthesis(int n) 
    {
        List<String> lst = new ArrayList<>();
        StringBuilder str = new StringBuilder("");
        generateParenthesis(n,lst,str,0,0);
        return lst; 
    }

    public void generateParenthesis(int n,List<String> lst, StringBuilder str,int o,int c)
    {
        if(str.length()==2*n)
        {
            lst.add(str.toString());
            return;
        }

        if(o<n)
        {
            str = str.append('(');
            generateParenthesis(n,lst,str,o+1,c);
            str.deleteCharAt(str.length()-1);
        }

        if(c<o)
        {
            str = str.append(')');
            generateParenthesis(n,lst,str,o,c+1);
            str.deleteCharAt(str.length()-1);
        }
    } 
}
