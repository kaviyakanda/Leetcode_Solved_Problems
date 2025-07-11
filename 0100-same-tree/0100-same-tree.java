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
    public boolean isSameTree(TreeNode p, TreeNode q) {
 
    List<Integer>res1=new ArrayList<>();
    List<Integer>res2=new ArrayList<>();
    preorder(p,res1);
    preorder(q,res2);
    if(res1.equals(res2)) return true;
    return false;
    }
    private void preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(null); 
            return;
        }
        list.add(root.val); 
        preorder(root.left, list);  
        preorder(root.right, list);
    }

}