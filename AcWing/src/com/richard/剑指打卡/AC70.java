package com.richard.剑指打卡;

import java.util.ArrayList;
import java.util.List;

public class AC70 {

    List<TreeNode> list = new ArrayList<>();

    public TreeNode kthNode(TreeNode root, int k) {

        merge(root);

        return list.get(k-1);

    }

    public void merge(TreeNode root) {
        if (null == root) {
            return ;
        }
        merge(root.left);
        list.add(root);
        merge(root.right);

    }

}
