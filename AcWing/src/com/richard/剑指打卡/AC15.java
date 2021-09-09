package com.richard.剑指打卡;

/**
 * 15. 二维数组中的查找
 */
public class AC15 {

    public boolean searchArray(int[][] array, int target) {

        if (array.length==0 || array[0].length==0) {
            return false;
        }

        int i = 0;
        int j = array[0].length - 1;

        while (i<array.length && j>=0) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] < target){
                i++;
            } else {
                j--;
            }
        }
        return false;

    }

}
