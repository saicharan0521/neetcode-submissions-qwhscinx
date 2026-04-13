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
    public boolean isBalanced(TreeNode root) 
    {
        if(root==null)
            return true;
        
        int res = isBal(root);
        if(res==-1)
            return false;
        return true;
        

    }

    int isBal(TreeNode root)
    {
        if(root==null)
            return 0;
        int left = isBal(root.left);
        if(left==-1)
            return -1;
        int right = isBal(root.right);
            if(right==-1)
                return -1;
        if(Math.abs(left-right)>1)
            return -1;
        return Math.max(left,right)+1;

    }
}
