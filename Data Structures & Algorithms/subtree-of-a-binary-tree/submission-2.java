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
       if(root==null)
        return false;

        if(isSubtree2(root,sub))
            return true;
        return isSubtree(root.left,sub)||isSubtree(root.right,sub);
    }

    boolean isSubtree2(TreeNode p,TreeNode q)
    {
        if(p==null||q==null)
            return p==q;
        if(p.val!=q.val)
            return false;
        return isSubtree2(p.left,q.left)&&isSubtree2(p.right,q.right);
    }
}