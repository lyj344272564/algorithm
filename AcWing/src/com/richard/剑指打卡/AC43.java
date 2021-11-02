package com.richard.剑指打卡;

import java.util.*;

public class AC43 {

    public List<Integer> printFromTopToBottom(TreeNode root) {
       List<Integer> res = new ArrayList<>();
       if (null == root) {
           return res;
       }

       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);
       while (!q.isEmpty()) {
           TreeNode t = q.poll();
           res.add(t.val);
           if (null != t.left) {
               q.offer(t.left);
           }
           if (null != t.right) {
               q.offer(t.right);
           }
       }

       return res;
    }

}
