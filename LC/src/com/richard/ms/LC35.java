package com.richard.ms;

import javax.swing.plaf.basic.BasicSplitPaneUI;

/**
 * 35. 搜索插入位置
 */
public class LC35 {

    public int searchInsert(int[] nums, int target) {
//        int n = nums.length;
//        int left = 0, right = n - 1, ans = n;
//        while (left <= right) {
//            int mid = ((right - left) >> 1) + left;
//            if (target <= nums[mid]) {
//                ans = mid;
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return ans;
//

        int n = nums.length;
        int l = 0;
        int r = n-1;
        int ans = n;

        while (l<=r) {
            int mid = l+r >> 1;
            if (target <= nums[mid]) {
                // 找到第一个比比他小的赋值给ans
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

}
