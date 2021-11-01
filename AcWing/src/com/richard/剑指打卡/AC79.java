package com.richard.剑指打卡;

import java.util.LinkedList;

public class AC79 {

    public int[] maxInWindows(int[] nums, int k) {
        //  边界下标
        if (nums==null || k<1 || nums.length<k) {
            return null;
        }

        // 存储下标
        LinkedList<Integer> qmax = new LinkedList<Integer>();
        int[] res = new int[nums.length-k+1];

        // res 的下标
        int idx = 0;

        for (int i=0; i<nums.length; i++) {
            // 消除最小的
            while (!qmax.isEmpty() && nums[qmax.peekLast()] <= nums[i]) {
                qmax.pollLast();
            }
            // 给最后一个添加下标 为什么要加到最后一个是因为最大的一定要在第一个   这样子比较好删除前一个最大值并且在上面的那个while 会比较和现在i的大小 所以不用担心都加进去的问题
            qmax.addLast(i);
            // 判断是否窗口滑出  若滑出则弹出第一个
            if (qmax.peekFirst() == i - k) {
                qmax.pollFirst();
            }
            if (i >= k - 1) {
                res[idx++] = nums[qmax.peekFirst()];
            }

        }

        return res;
    }

}
