class Solution {
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;
        while(l<r)
        {
            if(!isalnum(s.charAt(l)))
            {
                l++;
                continue;
            }
            if(!isalnum(s.charAt(r)))
            {
                r--;
                continue;
            }
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    boolean isalnum(char ch) //ialnum means is alphabet or num
    {
        if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'))
            return true;
        return false;
    }
}