package com.richard.剑指打卡;

public class AC72 {

    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        }

        int lh = dfs(root.left);
        int rh = dfs(root.right);
        return Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int dfs(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return Math.max(dfs(root.left),dfs(root.right)) + 1;
    }
}
