package com.richard.AcWingLC;

import java.util.*;

public class LC103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        int cnt = 0;

        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int len = q.size();
            while (len-- != 0) {
                TreeNode t = q.peek();
                q.poll();
                level.add(t.val);
                if (t.left != null) {
                    q.add(t.left);
                }
                if (t.right != null) {
                    q.add(t.right);
                }
            }
            // 如果是偶数行则需要反转
            if (++cnt%2 == 0) {
                Collections.reverse(level);
            }
            res.add(level);
        }

        return res;
    }

}
