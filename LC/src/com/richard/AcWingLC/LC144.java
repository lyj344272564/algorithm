package com.richard.AcWingLC;

import java.util.ArrayList;
import java.util.List;

public class LC144 {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<Integer>();

        preorder(root,res);

        return res;
    }

    public void preorder(TreeNode root, List<Integer> res) {

        if (root == null) {
            return ;
        }

        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);

    }
}
