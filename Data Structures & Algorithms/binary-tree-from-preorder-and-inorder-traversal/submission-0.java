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

class Solution 
{
    Map<Integer,Integer> map;
    int i;
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        map = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }

        return buildTree(preorder,0,inorder.length-1);
    }

    public TreeNode buildTree(int[] preorder,int strt,int end)
    {
        if(strt>end||i>=preorder.length)
            return null;

        TreeNode root = new TreeNode(preorder[i++]);
        System.out.println(root.val);   
        int inRoot = map.get(root.val);

        root.left =  buildTree(preorder,strt,inRoot-1);
        root.right =  buildTree(preorder,inRoot+1,end);
        return root;
    }
}
