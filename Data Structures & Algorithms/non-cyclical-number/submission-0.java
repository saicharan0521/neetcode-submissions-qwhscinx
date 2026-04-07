class Solution {
    public boolean isHappy(int n) 
    {
        Set<Integer> st = new HashSet<>();
        String s = String.valueOf(n);
        while(true)
        {
            int sum = 0;
            for(int i=0;i<s.length();i++)
            {
                int val = (s.charAt(i)-'0');
                sum=sum+val*val;
            }
            // System.out.
            if(sum==1)
                return true;
            if(st.contains(sum))
                break;
            st.add(sum);
            s = String.valueOf(sum);
        }
        return false;
    }
}
