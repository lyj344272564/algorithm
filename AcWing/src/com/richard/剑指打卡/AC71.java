package com.richard.剑指打卡;

public class AC71 {

    public int treeDepth(TreeNode root) {

        if (null == root) {
            return 0;
        }

        return Math.max(treeDepth(root.left),treeDepth(root.right)) + 1;

    }

}
