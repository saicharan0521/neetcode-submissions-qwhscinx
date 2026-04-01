class Solution {
    public int largestRectangleArea(int[] h) 
    {
        int len = h.length;
        int nse[] = new int[len];
        int pse[] = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i=len-1;i>=0;i--)
        {
            while(!(st.isEmpty())&&h[i]<=h[st.peek()])
                st.pop();
            nse[i] = st.isEmpty()?len:st.peek();
            st.push(i);
        }

        st.clear();

        for(int i=0;i<len;i++)
        {
            while(!(st.isEmpty())&&h[i]<=h[st.peek()])
                st.pop();
            pse[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }

        int max = 0;
        for(int i=0;i<len;i++)
        {
            int val = (nse[i]-pse[i]-1)*h[i];
            if(max<val)
                max = val;
        }

        return max;

    }
}
