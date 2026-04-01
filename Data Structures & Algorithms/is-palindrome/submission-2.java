class Solution {
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;
        while(l<r)
        {
            if(l<r&&isalnum(s.charAt(l))&&isalnum(s.charAt(r))&&s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;
            }
            while(l<r&&!(isalnum(s.charAt(l))))
                l++;
            while(l<r&&!(isalnum(s.charAt(r))))
                r--;
            if(l<r&&s.charAt(l)!=s.charAt(r))
                return false;            
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
