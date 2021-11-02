package com.richard.剑指打卡;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AC44 {

    public List<List<Integer>> printFromTopToBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
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
            // 每次遍历完一层都会加到res里面
            res.add(level);
        }
        return res;
    }
}
