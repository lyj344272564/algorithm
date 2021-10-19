package com.richard.剑指打卡;

/**
 * 52. 数组中出现次数超过一半的数字
 */
public class AC52 {

    public int moreThanHalfNum_Solution(int[] nums) {

        int leader = 0;
        int cnt = 0;

        for (int num : nums) {
            //如果票数为0，证明没有leader，让当前数字当leader
            if (cnt == 0) {
                leader = num;
            }
            ;//当前数字和leader一样，票数加1，否则减1
            cnt += num==leader? 1 : -1;
        }
        return leader;
    }

}
