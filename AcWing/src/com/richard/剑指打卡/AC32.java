package com.richard.剑指打卡;

/**
 * 32. 调整数组顺序使奇数位于偶数前面
 */
public class AC32 {

    public void reOrderArray(int [] array) {

        int i = 0;
        int j = array.length - 1;

        while (i <= j) {

            while (i<=j && array[i]%2 == 1) {
                i++;
            }

            while (i<=j && array[j]%2 == 0) {
                j--;
            }

            if (i<j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

    }

}
