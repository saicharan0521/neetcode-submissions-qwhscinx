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
    int max = -10000;
    public int maxPathSum(TreeNode root) 
    {
       maxPath(root);
       return max;
    }

    public int maxPath(TreeNode root)
    {
        if(root==null)
            return 0;

        int l = maxPath(root.left);
        int r = maxPath(root.right);
        int sum =0;
        if(l>0)
         sum+=l;
        else
            l = 0;
        if(r>0)
            sum+=r;
        else
            r = 0;
        sum+=root.val;
        max = Math.max(max,sum);
        sum = 0;
        sum = root.val+Math.max(l,r);
        return sum;
    }
}
