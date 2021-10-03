package com.richard.ms;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

/**
 * 寻找重复数组
 */
public class LC287 {


//    public int findDuplicate(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        for (int i=0; i<nums.length; i++) {
//            if (list.contains(nums[i])) {
//                return nums[i];
//            }
//            list.add(nums[i]);
//        }
//        return 0;
//    }

    //二分
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        int l = 1;
        int r = n - 1;
        int ans = -1;

        while (l <= r) {

            int mid = l + r >> 1;
            int cnt = 0;
            for (int i=0; i<n; ++i) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }

        }

        return ans;

    }

//    public int findDuplicate(int[] nums) {
//
//        int a = 0;
//        int b = 0;
//        while (true) {
//            a = nums[a];
//            b = nums[nums[b]];
//            if (a == b) {
//                a = 0;
//                while (a != b) {
//                    a = nums[a];
//                    b = nums[b];
//                }
//                return a;
//            }
//        }
//
//    }

}
