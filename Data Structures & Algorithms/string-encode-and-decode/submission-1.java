class Solution {

    public String encode(List<String> strs) 
    {
        if(strs.isEmpty())
            return "\0";
        int i=0;
        for(String s:strs)
        {
            if(s=="")
            {
                strs.set(i,"@^@");
            }
            i++;
        }
        String str = String.join("-",strs);
        return str;
    }

    public List<String> decode(String str) 
    {
        List<String> strs = Arrays.asList(str.split("-"));
        if(str.equals("\0"))
            return new ArrayList<>();
        
            for(int i=0;i<strs.size();i++)
            {
                if(strs.get(i).equals("@^@"))
                    strs.set(i,"");
            }
        return strs;
    }
}