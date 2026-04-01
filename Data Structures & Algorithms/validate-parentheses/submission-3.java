class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('||st.isEmpty())
            {
                st.push(s.charAt(i));
            }

            else if(!(st.isEmpty())&&(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'))
            {
                Character ch = st.peek();
                if((ch=='{'&&s.charAt(i)=='}')||
                    (ch=='['&&s.charAt(i)==']')||
                    (ch=='('&&s.charAt(i)==')') 
                  )
                {
                    st.pop();
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        if(!(st.isEmpty()))
            return false;
        return true;
    }
}
