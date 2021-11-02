package com.richard.剑指打卡;

public class AC39 {

    public boolean isSymmetric(TreeNode root) {

        if (null == root) {
            return true;
        }

        return dfs(root.left,root.right);
    }

    boolean dfs(TreeNode p, TreeNode q) {
        if (null==p || null==q) {
            return null==p&&null==q;
        }
        if (p.val != q.val) {
            return false;
        }
        return dfs(p.left,q.right) && dfs(p.right,q.left);
    }
}
