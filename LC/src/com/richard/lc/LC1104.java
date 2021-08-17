package com.richard.lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC1104 {

        public List<Integer> pathInZigZagTree(int label) {
            int row = 1;
            int rowStart = 1;

            while (rowStart*2 <= label) {
                row++;
                rowStart *= 2;
            }
            List<Integer> path = new ArrayList<>();

            // 如果是偶数行 ，那么计算他正常的是几
            if (row % 2 == 0) {
                label = getReverse(label, row);
            }

            while (row > 0) {
                if (row % 2 == 0) {
                    path.add(getReverse(label,row));
                } else {
                    path.add(label);
                }
                row--;
                label >>= 1;
            }

            // 逆序存的所以要反转集合 用到了Java API
            Collections.reverse(path);

            return path;
        }

    /**
     * 返回在偶数层反转后的数字
     * @param label 正常的数字
     * @param row 行数
     * @return 返回在偶数层反转后的数字
     */
        public int getReverse(int label, int row) {
            return (1 << (row - 1)) + (1 << row) - 1 - label;
        }

}
