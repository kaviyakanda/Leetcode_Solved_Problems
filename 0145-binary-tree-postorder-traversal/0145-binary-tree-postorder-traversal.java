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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        Post(root,l);
        return l;
        
    }
    private List<Integer> Post(TreeNode root,List<Integer> ll)
    {
        if(root==null) return ll;
        Post(root.left,ll);
        Post(root.right,ll);
        ll.add(root.val);

        return ll;

    }



}