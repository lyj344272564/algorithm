package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;

/**
 * 839、模拟堆
 */
public class AC839 {

    private static final int N = 100010;
    private static int[] ph = new int[N];
    private static int[] hp = new int[N];
    private static int[] h = new int[N];
    private static int size = 0;
    private static int m = 0;

    private static void heap_swap(int a, int b) {

        int temp = ph[hp[a]];
        ph[hp[a]] = ph[hp[b]];
        ph[hp[b]] = temp;

        int temp2 = hp[a];
        hp[a] = hp[b];
        hp[b] = temp2;

        int temp3 = h[a];
        h[a] = h[b];
        h[b] = temp3;

    }

    private static void down(int u) {
        int t = u;
        if (2*u<=size && h[2*u] < h[t]) {
            t = 2*u;
        }
        if (2*u+1 <= size && h[2*u+1] < h[t]) {
            t = 2*u+1;
        }
        if (u!=t) {
            heap_swap(t,u);
            down(t);
        }

    }

    private static void up(int u) {
        while (u/2>0 && h[u/2]>h[u]) {
            heap_swap(u,u/2);
            u /= 2;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while (n-- != 0) {

            String[] cur = br.readLine().split(" ");

            if (cur[0].equals("I")) {
                int x = Integer.parseInt(cur[1]);
                size++;
                m++;
                ph[m] = size;
                hp[size] = m;
                h[size] = x;
                up(size);
            } else if (cur[0].equals("PM")) {
                System.out.println(h[1]);
            } else if (cur[0].equals("C")) {
                int k = Integer.parseInt(cur[1]);
                int x = Integer.parseInt(cur[2]);
                k = ph[k];
                h[k] = x;
                down(k);
                up(k);
            } else if (cur[0].equals("DM")) {
                heap_swap(size,1);
                size--;
                down(1);
            } else {
                int k = Integer.parseInt(cur[1]);
                k = ph[k];
                heap_swap(size, k);
                size--;
                down(k);
                up(k);
            }

        }

    }

//    private static final int N = 100010;
//    // 第k个插入的下标是啥  插入数在数组的下标
//    private static int[] ph = new int[N];
//    // 堆里面的某一个点是第几个插入的点;  数组下标对应的插入数 堆里面的那个点是第几个插入的点
//    private static int[] hp = new int[N];
//    private static int[] h = new int[N];
//    private static int size = 0;
//    private static int m = 0;
//
//    private static void heap_swap(int a, int b) {
//
//        int temp = ph[hp[a]];
//        ph[hp[a]] = ph[hp[b]];
//        ph[hp[b]] = temp;
//
//        int temp2 = hp[a];
//        hp[a] = hp[b];
//        hp[b] = temp2;
//
//        int temp3 = h[a];
//        h[a] = h[b];
//        h[b] = temp3;
//
//    }
//
//    private static void down(int u) {
//        int t = u;
//        if (u*2 <= size && h[u*2] < h[t]) {
//            t = u*2;
//        }
//        if (u*2+1 <= size && h[u*2+1]<h[t]) {
//            t = u*2+1;
//        }
//        // 证明可以down 也可以成为递归终止条件
//        if (u != t) {
//            heap_swap(u,t);
//            // 继续down
//            down(t);
//        }
//    }
//
//    private static void up(int u) {
//        while (u/2>0 && h[u/2]>h[u]) {
//            heap_swap(u,u/2);
//            u /= 2;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//
//        while (n-- != 0) {
//
//            String op = sc.next();
//
//            if (op.equals("I")) {
//                int x = sc.nextInt();
//                size++;
//                m++;
//                ph[m] = size;
//                hp[size] = m;
//                h[size] = x;
//                up(size);
//            } else if (op.equals("PM")) {
//                System.out.println(h[1]);
//            } else if (op.equals("DM")) {
//                heap_swap(1,size--);
//                down(1);
//            } else if (op.equals("D")) {
//                int k = sc.nextInt();
//                k = ph[k];
//                heap_swap(k,size--);
//                down(k);
//                up(k);
//            } else if (op.equals("C")) {
//                int k = sc.nextInt();
//                int x = sc.nextInt();
//                k = ph[k];
//                h[k] = x;
//                down(k);
//                up(k);
//            }
//
//        }
//    }

}
