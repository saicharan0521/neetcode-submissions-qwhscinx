class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int len = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[len];
        st.push(len-1);
        nge[len-1]=0;
        for(int i=len-2;i>=0;i--)
        {
            while(!(st.isEmpty())&&(temperatures[st.peek()]<=temperatures[i]))
            {
                st.pop();
            }
            nge[i] = !(st.isEmpty())?st.peek()-i:0;
            st.push(i);
        }
        return nge;
    }
}
