package com.richard.剑指打卡;

/**
 * 38. 二叉树的镜像
 */
public class AC38 {

    public void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        mirror(root.left);
        mirror(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
    }

}
