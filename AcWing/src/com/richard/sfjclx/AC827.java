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
    private static int[] e = new int[N];
    private static int[] l = new int[N];
    private static int[] r = new int[N];
    private static int idx = 0;

    static void init() {
        r[0] = 1;
        l[1] = 0;
        idx = 2;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        init();
        while (M-- != 0) {

            String[] cur = br.readLine().split(" ");
            if (cur[0].equals("L")) {
                add(0,Integer.parseInt(cur[1]));
            } else if (cur[0].equals("R")) {
                add(l[1],Integer.parseInt(cur[1]));
            } else if (cur[0].equals("D")) {
                remove(Integer.parseInt(cur[1])+1);
            } else if (cur[0].equals("IL")) {
                add(l[Integer.parseInt(cur[1])+1], Integer.parseInt(cur[2]));
            } else {
                add(Integer.parseInt(cur[1])+1, Integer.parseInt(cur[2]));
            }

        }
        for (int i=r[0]; i!=1; i=r[i]) {
            System.out.print(e[i] + " ");
        }



    }

    // 在第k个右面插入
    private static void add(int k, int x) {
        
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        l[r[k]] = idx;
        r[k] = idx;
        idx++;
        
    }

    // 删除第k个插入的元素
    private static void remove(int k) {
        l[r[k]] = l[k];
        r[l[k]] = r[k];
    }


//
//    private static final int N = 100010;
//    // 值
//    private static int[] e = new int[N];
//    // 左
//    private static int[] l = new int[N];
//    // 右
//    private static int[] r = new int[N];
//    private static int idx;
//
//    static void init(){
//        r[0]=1;
//        l[1]=0;
//        idx=2;
//    }
//
//    private static void add(int k, int x) {
//        e[idx] = x;
//        r[idx] = r[k];
//        l[idx] = k;
//        // 先改r[k] 的左指针然后再改右指针
//        l[r[k]] = idx;
//        r[k] = idx;
//        idx++;
//    }
//
//    // 删除第k个点
//    private static void remove(int k) {
//        r[l[k]] = r[k];
//        l[r[k]] = l[k];
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        int M = Integer.parseInt(bf.readLine());
//
//        init();
//
//        while(M-->0){
//            String[]arr=bf.readLine().split(" ");
//            String op=arr[0];
//
//            if(op.equals("L")){
//                int x = Integer.parseInt(arr[1]);
//                add(0, x);
//            }else if(op.equals("R")){
//                int x = Integer.parseInt(arr[1]);
//                add(l[1], x);
//            }else if(op.equals("D")){
//                int k = Integer.parseInt(arr[1]);
//                remove(k+1);
//            }else if(op.equals("IL")){
//                int k = Integer.parseInt(arr[1]);
//                int x = Integer.parseInt(arr[2]);
//                add(l[k+1], x);
//            }else{
//                int k = Integer.parseInt(arr[1]);
//                int x = Integer.parseInt(arr[2]);
//                add(k+1, x);
//            }
//        }
//
//        for(int i=r[0]; i!=1; i=r[i]) {
//            System.out.print(e[i]+" ");
//        }
//    }

}
