class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxlen=0;
        for(int i=0;i<s.length();i++)
        {
            if(map.getOrDefault(s.charAt(i),-1)!=-1&& map.get(s.charAt(i))>=left)
            {
                left = map.get(s.charAt(i))+1;
            }
            map.put(s.charAt(i),i);
            maxlen = Math.max(maxlen,i-left+1);
        }    
        return maxlen;
    }
}
