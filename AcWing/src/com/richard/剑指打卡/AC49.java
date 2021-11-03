package com.richard.剑指打卡;

public class AC49 {

    public TreeNode convert(TreeNode root) {
        // 判断边界
        if (null == root) {
            return null;
        }
        // 找到
        TreeNode left = rightMost(root.left);
        TreeNode right = leftMost(root.right);
        // 递归
        convert(root.left);
        convert(root.right);
        // 左右连接
        if (null != left) {
            left.right = root;
        }
        root.left = left;
        if (null != right) {
            right.left = root;
        }
        root.right = right;
        while (null != root.left) {
            root = root.left;
        }

        return root;
    }

    // 最左
    TreeNode leftMost(TreeNode root) {
        if (null == root) {
            return null;
        }
        while (null != root.left) {
            root = root.left;
        }
        return root;
    }

    // 最右
    TreeNode rightMost(TreeNode root) {
        if (null == root) {
            return null;
        }
        while (null != root.right) {
            root = root.right;
        }
        return root;
    }
}
