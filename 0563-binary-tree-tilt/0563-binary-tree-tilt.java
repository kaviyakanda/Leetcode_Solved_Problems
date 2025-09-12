//Not changing actual node values as we dont need to
class Solution {
    private int sum = 0;

    public int find(TreeNode root) {
        if (root == null)
            return 0;
        int left = find(root.left);
        int right = find(root.right);
        sum += Math.abs(left - right);
        return root.val + left + right;
    }

    public int findTilt(TreeNode root) {
        find(root);
        return sum;
    }
}