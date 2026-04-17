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
        // TreeNode node = findNode(root,subRoot);
        // if(node==null)
        //     return false;
        // return isSubtree2(node,subRoot);

        Queue<TreeNode> q = new LinkedList<>();
        List<TreeNode> lst = new ArrayList<>();
        q.add(root);
        while(!(q.isEmpty()))
        {
            int len = q.size();
            for(int i=0;i<len;i++)
            {
                TreeNode node = q.poll();
                if(node.val==sub.val)
                {
                    lst.add(node);
                }
                
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
        }

        for(int i=0;i<lst.size();i++)
        {
            boolean n = isSubtree2(lst.get(i),sub);
            if(n)
                return n;
        }

        return false;
    }

    // TreeNode findNode(TreeNode root, TreeNode subRoot)
    // {
    //     if(root==null)
    //         return null;
        
    //     if(root.val==subRoot.val)
    //         return root;
        
    //     TreeNode l = findNode(root.left,subRoot);
    //     if(l!=null)
    //         return l;
    //     TreeNode r = findNode(root.right,subRoot);
    //     if(r!=null)
    //         return r;

    //     return null;
    // }

    boolean isSubtree2(TreeNode p,TreeNode q)
    {
        if((p==null&&q==null))
            return true;
        if(p==null||q==null)
            return false;
        if(p.val!=q.val)
            return false;
        
        return isSubtree2(p.left,q.left)&&isSubtree2(p.right,q.right);
    }
}
