package com.richard.剑指打卡;

import java.util.*;

public class AC50 {


    // Encodes a tree to a single string.
    String serialize(TreeNode root) {
        if (null == root) {
            return "#";
        }
        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> stack = new LinkedList<>();
        stack.offerLast(root);
        while (!stack.isEmpty()) {
            TreeNode t  = stack.pollLast();
            if (null == t) {
                sb.append("#").append(",");
            } else {
                sb.append(t.val).append(",");
                stack.offerLast(t.right);
                stack.offerLast(t.left);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    TreeNode deserialize(String data) {
        Deque<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(queue);
    }

    TreeNode buildTree(Deque<String> queue) {
        String s = queue.poll();
        if ("#".equals(s)) {
            return null;
        }

        int val = Integer.parseInt(s);
        TreeNode root = new TreeNode(val);
        root.left = buildTree(queue);
        root.right = buildTree(queue);
        return root;
    }
}
