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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer>l=new ArrayList<>();
        Inorder(root,l);
        return l;

    }
    private List<Integer> Inorder(TreeNode root,List<Integer> l)
    {
        if(root==null) return l;
        Inorder(root.left,l);
        l.add(root.val);
        Inorder(root.right,l);


        return l; 
        

    }
}