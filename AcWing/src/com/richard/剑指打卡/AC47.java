package com.richard.剑指打卡;

import java.util.ArrayList;
import java.util.List;

/**
 * 47. 二叉树中和为某一值的路径
 */
public class AC47 {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> findPath(TreeNode root, int sum) {

        dfs(root,sum);
        return ans;

    }

    public void dfs(TreeNode root,int sum) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        sum -= root.val;
        if (root.left==null && root.right==null && sum == 0) {
            List<Integer> temp = new ArrayList<>(path);
            ans.add(temp);
        }

        dfs(root.left,sum);
        dfs(root.right,sum);

        path.remove(path.size()-1);

    }

}
