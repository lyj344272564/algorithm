package com.richard.剑指打卡;

/**
 * 37. 树的子结构
 */
public class AC37 {

    public boolean hasSubtree(TreeNode pRoot1, TreeNode pRoot2) {

        if (pRoot1 == null || pRoot2 == null) {
            return false;
        }

        if (isPart(pRoot1,pRoot2)) {
            return true;
        }

        return hasSubtree(pRoot1.left, pRoot2) || hasSubtree(pRoot1.right,pRoot2);

    }

    public static boolean isPart(TreeNode p1, TreeNode p2) {

        if (p2 == null) {
            return true;
        }

        if (p1 == null || p1.val != p2.val) {
            return false;
        }
        return isPart(p1.left,p2.left) && isPart(p1.right,p2.right);
    }

}
