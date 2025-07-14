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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            int LeftH=Height(curr.left);
            int rightH=Height(curr.right);
            if(Math.abs(LeftH-rightH)>1)return false;
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);

        }
        return true;
    }
    public int Height(TreeNode node)
    {
        if(node==null)return 0;
        return 1+Math.max(Height(node.left),Height(node.right));

    }
}





