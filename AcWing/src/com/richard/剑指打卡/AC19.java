package com.richard.剑指打卡;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

/**
 * AcWing 19. 二叉树的下一个节点
 */
public class AC19 {
    public TreeNode inorderSuccessor(TreeNode p) {

        if (p.right != null) {
            p = p.right;
            while (p.left != null) {
                p = p.left;
            }
            return p;
        }

        while (p.father != null && p == p.father.right) {
            p = p.father;
        }
        return p.father;
    }
}
