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
        List<List<Integer>> wrap = new ArrayList<>();
        List<Integer> sublist;
        if(root==null)
            return new ArrayList<>();
        q.offer(root);
        int len = 0;
        while(!(q.isEmpty()))
        {
            sublist = new ArrayList<>();
            len = q.size();
            for(int i=0;i<len;i++)
            {
                TreeNode node = q.poll();
                sublist.add(node.val);
                if(node.left!=null)
                {
                    q.add(node.left);
                }

                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            wrap.add(sublist);
        }
        len = wrap.size();
        sublist = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            sublist.add(wrap.get(i).get(wrap.get(i).size()-1));
        } 

        return sublist;
    }
}
