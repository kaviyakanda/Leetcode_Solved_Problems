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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        PreOrder(root,l);
        return l;
    }
    private List<Integer>PreOrder(TreeNode root,List<Integer>l)
    {
        if(root==null)return l;
        l.add(root.val);
        PreOrder(root.left,l);
        PreOrder(root.right,l);
        return l;
    }
}