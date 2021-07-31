package com.richard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个二叉树（具有根结点 root）， 一个目标结点 target ，和一个整数值 K 。
 *
 * 返回到目标结点 target 距离为 K 的所有结点的值的列表。 答案可以以任何顺序返回。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, K = 2
 * 输出：[7,4,1]
 * 解释：
 * 所求结点为与目标结点（值为 5）距离为 2 的结点，
 * 值分别为 7，4，以及 1
 *
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LC863 {
    Map<Integer, TreeNode> parents = new HashMap<Integer, TreeNode>();
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        findParents(root);
        findAns(target, null, 0, k);
        return ans;
    }

    public void findParents(TreeNode node) {
        if (node.left != null) {
            parents.put(node.left.val, node);
            findParents(node.left);
        }
        if (node.right != null) {
            parents.put(node.right.val, node);
            findParents(node.right);
        }
    }

    public void findAns(TreeNode node, TreeNode from, int depth, int k) {
        if (node == null) {
            return;
        }
        if (depth == k) {
            ans.add(node.val);
            return;
        }
        // 向下操作
        if (node.left != from) {
            findAns(node.left, node, depth + 1, k);
        }
        if (node.right != from) {
            findAns(node.right, node, depth + 1, k);
        }
        // 向上操作
        if (parents.get(node.val) != from) {
            findAns(parents.get(node.val), node, depth + 1, k);
        }

    }


}

