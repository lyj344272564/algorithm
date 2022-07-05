package com.richard.zs;

import java.util.Arrays;

/**
 * @Author: Richard
 * @Date: 2022-07-04 9:03
 */

public class 螺旋矩阵4 {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
        for (int i=0; i<m; i++) {
            Arrays.fill(res[i], -1);
        }
        int x = 0;
        int y = 0;
        while (head.next != null) {
            while (head.next !=null && y+1<n && res[x][y+1]==-1) {
                res[x][y++] = head.val;
                head = head.next;
            }
            while (head.next !=null && x+1<m && res[x+1][y]==-1) {
                res[x++][y] = head.val;
                head = head.next;
            }
            while (head.next !=null && y>0 && res[x][y-1]==-1) {
                res[x][y--] = head.val;
                head = head.next;
            }
            while (head.next !=null && x>0 && res[x-1][y]==-1) {
                res[x--][y] = head.val;
                head = head.next;
            }
        }
        res[x][y] = head.val;
        return res;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


