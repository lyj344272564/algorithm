package com.richard.sfjclx;

/**
 * 827. 双链表
 */
public class AC827 {

    private static final int N = 100010;
    private static int[] e = new int[N];
    private static int[] l = new int[N];
    private static int[] r = new int[N];
    private static int idx;

    static void init(){
        r[0]=1;
        l[1]=0;
        idx=2;
    }

    // 在第k个点的右面插入x
    private static void r_add(int k, int x) {
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        r[k] = idx;
        l[r[k]] = idx;
    }

    //在k的左面插入
    private static void l_add(int k, int x) {
        r_add(l[k], x);
    }

    // 删除第k个点
    private static void remove(int k) {
        r[l[k]] = r[k];
        l[r[k]] = l[k];
    }



    public static void main(String[] args) {

    }

}
