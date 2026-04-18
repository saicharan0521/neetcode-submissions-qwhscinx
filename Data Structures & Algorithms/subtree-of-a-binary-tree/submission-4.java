/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode sub) 
    {
        String str1 = serialization(root,"");
        String str2 = serialization(sub,"");
        System.out.println(str1+" "+str2);
        if(str1.contains(str2))
            return true;
        return false;
    }

    String serialization(TreeNode node,String str)
    {
        if(node!=null)
        {
            str = str+node.val+",";
            str=serialization(node.left,str);
            str=serialization(node.right,str);
        }
        else
        {
            str=str+"null,";
        }

        return str;
    }
}
