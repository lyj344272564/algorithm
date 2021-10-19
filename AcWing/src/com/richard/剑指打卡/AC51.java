package com.richard.剑指打卡;

import sun.reflect.annotation.AnnotationSupport;
import sun.util.resources.cldr.uz.CalendarData_uz_Cyrl_UZ;

import java.awt.im.InputContext;
import java.util.*;

/**
 * 51. 数字排列
 */
public class AC51 {


    public List<List<Integer>> permutation(int[] nums) {

        int len = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        // 长度为0直接返回空的res
        if (len == 0) {
            return res;
        }

        // 定义一个队列
        Deque<Integer> path = new ArrayDeque<>();

        // 是否被使用过
        boolean[] used = new boolean[len];
        // 排序
        Arrays.sort(nums);

        dfs(nums, path, used, res, 0);

        return res;
    }

    /**
     *
     * @param nums
     * @param path 路径
     * @param used 是否被使用
     * @param res res
     * @param cur 当前的一个长度
     */
    public static void dfs(int[] nums, Deque<Integer> path, boolean[] used, List<List<Integer>> res, int cur) {

        if (cur == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i=0; i<nums.length; i++) {

            // 如果被使用过，则continue;
            if (used[i]) {
                continue;
            }

            // 去重
            if (i>0 && nums[i]==nums[i-1] && !used[i-1]) {
                continue;
            }


            // 在最后面添加一个元素
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums,path,used,res,cur+1);
            // 恢复现场
            used[i] = false;
            path.removeLast();


        }

    }

}
