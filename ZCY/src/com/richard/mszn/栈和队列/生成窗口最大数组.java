package com.richard.mszn.栈和队列;

import java.util.LinkedList;

public class 生成窗口最大数组 {

    public int[] getMaxWindow(int[] arr, int w) {

        // 判断边界条件
        if (arr == null || w<1 || arr.length<w) {
            return null;
        }

        LinkedList<Integer> qmax = new LinkedList<Integer>();
        // 返回的结果集 arr.length-w+1 表示结果的个数
        int[] res = new int[arr.length-w+1];
        int idx = 0;

        for (int i=0; i<arr.length; i++) {
            // 大于的时候弹出
            while (!qmax.isEmpty() && arr[qmax.peekLast()]<=arr[i]) {
                qmax.pollLast();
            }
            // 非空以及小于的时候插入 以及都弹出后插入
            qmax.addLast(i);
            // 判断是否失效
            if (qmax.peekFirst() == i-w) {
                qmax.pollFirst();
            }
            if (i >= w+1){
                res[idx++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }

}