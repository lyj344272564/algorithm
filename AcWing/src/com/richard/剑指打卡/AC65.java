package com.richard.剑指打卡;

/**
 * 65. 数组中的逆序对
 */
public class AC65 {

    static int[] temp;

    public int inversePairs(int[] nums) {

        temp = new int[nums.length];
        return merge_sort(nums, 0, nums.length-1);
    }

    public static int merge_sort(int[] q, int l, int r) {

        if (l >= r) {
            return 0;
        }

        int mid = l + r >> 1;

        int res = merge_sort(q, l, mid) + merge_sort(q, mid+1, r);

        int k = 0;
        int i = l;
        int j = mid + 1;

        while (i<=mid && j<=r) {
            if (q[i] <= q[j]) {
                temp[k++] = q[i];
            } else {
                temp[k++] = q[j];
                res += mid - i + 1;
            }
        }
        while (i <= mid) {
            temp[k++] = q[i++];
        }

        while (j <= r) {
            temp[k++] = q[j++];
        }

        for (i=l,j=0; i<=r; i++,j++) {
            q[i] = temp[j];
        }

        return res;

    }
}
