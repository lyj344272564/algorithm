package com.richard;

import java.util.Scanner;

/**
 * 3784. 交换相邻元素
 *    题目
 *    提交记录
 *    讨论
 *    题解
 *    视频讲解
 *
 * 给定一个长度为 n 的数组 a1,a2,…,an。
 *
 * 该数组是一个 1∼n 的排列。
 *
 * 数组的前 n−1 个位置中，部分位置可以进行交换操作，将该位置的元素与后面相邻位置的元素进行互换。
 *
 * 交换操作的次序和次数均不限。
 *
 * 请你判断给定的数组能否通过交换操作变为一个升序数组。
 *
 * 输入格式
 * 第一行包含整数 n。
 *
 * 第二行包含 n 个整数 a1,a2,…,an。
 *
 * 第三行包含一个长度为 n−1 的 01 字符串，第 i 个字符为 1 表示第 i 个位置可以进行交换操作，第 i 个字符为 0 表示第 i 个位置无法进行交换操作。
 *
 * 输出格式
 * 给定的数组可以通过交换操作变为一个升序数组则输出 YES，否则输出 NO。
 *
 * 数据范围
 * 2≤n≤2×105,
 * 1≤ai≤n,ai 两两不同。
 *
 * 输入样例1：
 * 6
 * 1 2 5 3 4 6
 * 01110
 * 输出样例1：
 * YES
 * 输入样例2：
 * 6
 * 1 2 5 3 4 6
 * 01010
 * 输出样例2：
 * NO
 */
public class AC3784 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n+1];

        // 录入数据
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        // 输入01串
        String s = sc.next();

        boolean flag = true;

        // 遍历寻找判断边界是否为最大值
        for (int i=0,x=0; i<n-1; i++) {
            x = Math.max(x,a[i]);
            if (s.charAt(i)=='0' && x!=i+1) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
