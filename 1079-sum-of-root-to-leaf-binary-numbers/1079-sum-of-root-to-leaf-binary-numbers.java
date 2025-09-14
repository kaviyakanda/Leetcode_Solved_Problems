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
    public int sumRootToLeaf(TreeNode root) {

      return F(root,0);

    }
    public int F(TreeNode node,int curSum){
        if(node==null){
            return 0;
        }


        curSum =2*curSum+node.val;
        if(node.left==null&&node.right==null){
            return curSum;
        }
  
      return  F(node.left,curSum)+
        F(node.right,curSum);
    }
}