package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 827. 双链表
 *  优化某些问题
 */
public class AC827 {


    private static final int N = 100010;
    // 值
    private static int[] e = new int[N];
    // 左
    private static int[] l = new int[N];
    // 右
    private static int[] r = new int[N];
    private static int idx;

    static void init(){
        r[0]=1;
        l[1]=0;
        idx=2;
    }

    private static void add(int k, int x) {
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        // 先改r[k] 的左指针然后再改右指针
        l[r[k]] = idx;
        r[k] = idx;
        idx++;
    }

    // 删除第k个点
    private static void remove(int k) {
        r[l[k]] = r[k];
        l[r[k]] = l[k];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(bf.readLine());

        init();

        while(M-->0){
            String[]arr=bf.readLine().split(" ");
            String op=arr[0];

            if(op.equals("L")){
                int x = Integer.parseInt(arr[1]);
                add(0, x);
            }else if(op.equals("R")){
                int x = Integer.parseInt(arr[1]);
                add(l[1], x);
            }else if(op.equals("D")){
                int k = Integer.parseInt(arr[1]);
                remove(k+1);
            }else if(op.equals("IL")){
                int k = Integer.parseInt(arr[1]);
                int x = Integer.parseInt(arr[2]);
                add(l[k+1], x);
            }else{
                int k = Integer.parseInt(arr[1]);
                int x = Integer.parseInt(arr[2]);
                add(k+1, x);
            }
        }

        for(int i=r[0]; i!=1; i=r[i]) {
            System.out.print(e[i]+" ");
        }
    }

}
