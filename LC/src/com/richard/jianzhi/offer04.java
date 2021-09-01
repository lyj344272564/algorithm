package com.richard.jianzhi;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

/**
 * 剑指 Offer 04. 二维数组中的查找
 */
public class offer04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] < target) {
                i++;
            } else if (matrix[i][j] > target) {
                j--;
            }
        }

        return false;


    }

}
