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
        String str1 = serialization(root,new StringBuilder("")).toString();
        String str2 = serialization(sub,new StringBuilder("")).toString();
        if(str1.contains(str2))
            return true;
        return false;
    }

    StringBuilder serialization(TreeNode node,StringBuilder str)
    {
        if(node!=null)
        {
            str = str.append(node.val).append(",");
            str=serialization(node.left,str);
            str=serialization(node.right,str);
        }
        else
        {
            str=str.append("null,");
        }

        return str;
    }
}
