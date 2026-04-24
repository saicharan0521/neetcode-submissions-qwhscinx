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
    public int goodNodes(TreeNode root) 
    {
        int tot = 1+goodNodes(root.left,root.val)+goodNodes(root.right,root.val);
        return tot;
    }

    public int goodNodes(TreeNode root,int max)
    {
        if(root==null)
            return 0;

        int l = goodNodes(root.left,root.val>max?root.val:max);
        int r = goodNodes(root.right,root.val>max?root.val:max);
        if(max<=root.val)
            return 1+l+r;
        return l+r;
    }
}