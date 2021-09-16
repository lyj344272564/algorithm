package com.richard.剑指打卡;

/**
 * 46. 二叉搜索树的后序遍历序列
 */
public class AC46 {

    private static int[] s;

    public boolean verifySequenceOfBST(int [] sequence) {

        int n = sequence.length;

        s = sequence;
        return dfs(0,n-1);

    }

    static boolean dfs(int l, int r) {

        if (l>=r) {
            return true;
        }

        int root = s[r];
        int k = l;

        while (k<r && s[k]<root) {
            k++;
        }

        for (int i=k; i<r; i++) {
            if (s[i]<root) {
                return false;
            }
        }
        return dfs(l, k - 1) && dfs(k, r - 1);

    }

}
