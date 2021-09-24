package com.richard.剑指打卡;

import sun.reflect.annotation.AnnotationSupport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 51. 数字排列
 */
public class AC51 {

    static List<List<Integer>> ans = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();


    public static void dfs(int[] nums, int u, int start, int state) {

        if (u == nums.length) {
            ans.add(path);
            return;
        }

        if (u==0 || nums[u]!=nums[u-1] ) {
            start = 0;
        }



    }


}
