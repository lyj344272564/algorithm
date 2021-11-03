package com.richard.剑指打卡;

import java.io.File;
import java.util.*;

public class AC45 {
    public List<List<Integer>> printFromTopToBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = false;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i=0; i<size; i++) {
                TreeNode t = q.poll();
                level.add(t.val);
                if (null != t.left) {
                    q.offer(t.left);
                }
                if (null != t.right) {
                    q.offer(t.right);
                }
            }
            if (flag) {
                Collections.reverse(level);
            }
            flag = !flag;
            res.add(level);
        }
        return res;
    }
}
