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
    public List<Integer> rightSideView(TreeNode root) 
    {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> sublist = new ArrayList<>();
        if(root==null)
            return new ArrayList<>();
        q.offer(root);
        int cnt = 2;
        sublist.add(root.val);
        while(!(q.isEmpty()))
        {
            int len = q.size();
            for(int i=0;i<len;i++)
            {
                TreeNode node = q.poll();
                if(node.right!=null)
                {
                    if(sublist.size()<cnt)
                        sublist.add(node.right.val);
                    q.offer(node.right);   
                }
                if(node.left!=null)
                {
                    if(sublist.size()<cnt)
                        sublist.add(node.left.val);
                    q.offer(node.left);   
                }
            }
            cnt++;
        }

        return sublist;
    }
}
