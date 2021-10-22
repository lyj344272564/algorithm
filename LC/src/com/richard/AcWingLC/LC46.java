package com.richard.AcWingLC;

import java.util.ArrayList;
import java.util.List;

public class LC46 {

    static List<List<Integer>> res;
    static int[] g;
    static boolean[] st;

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        g = nums;
        st = new boolean[g.length];
        dfs(0,new ArrayList<>());

        return res;
    }

    public void dfs(int u,List<Integer> path) {
        if (u == g.length) {
            res.add(new ArrayList<>(path));
            return ;
        }
        for (int i=0; i<g.length; i++) {
            if (!st[i]) {
                st[i] = true;
                path.add(g[i]);
                dfs(u+1,path);
                // 恢复现场
                st[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

}
