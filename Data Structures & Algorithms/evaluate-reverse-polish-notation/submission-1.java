class Solution {
    public int evalRPN(String[] tokens) 
    {
        int len = tokens.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<len;i++)
        {
            char ch = tokens[i].charAt(0);
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && 
               !tokens[i].equals("*") && !tokens[i].equals("/"))
            {   
                st.push(Integer.parseInt(tokens[i]));
            }
            else
            {
                Integer op2 = st.pop();
                Integer op1 = st.pop();
                switch(ch)
                {
                    case '+':
                             st.push(op2+op1);
                             break;
                    case '-':
                             st.push(op1-op2);
                             break;
                    case '*':
                             st.push(op2*op1);
                             break;
                    case '/':
                             st.push(op1/op2);
                             break;
                }
            }
            
        }
        return (int)(st.pop());
    }
}
