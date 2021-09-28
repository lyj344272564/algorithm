package com.richard.sfjclx;

import java.io.*;

/**
 * 836. 合并集合
 */
public class AC836 {

    private static final int N = 100010;
    private static int[] p = new int[N];

    private static int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] val = br.readLine().split(" ");

        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);

        for (int i=1; i<=n; i++) {
            p[i] = i;
        }

        while (m-- != 0) {

            String[] cur = br.readLine().split(" ");
            int a = Integer.parseInt(cur[1]);
            int b = Integer.parseInt(cur[2]);
            if (cur[0].equals("M")) {
                p[find(a)] = find(b);
            } else {
                if (find(a) == find(b)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

        }

    }

//    private static final int N = 100010;
//    private static int[] p = new int[N];
//
//    // 返回x所在集合的编号  返回x的祖宗节点 + 路径压缩
//    private static int find(int x) {
//        if (p[x] != x) {
//            // 直接指向根节点
//            p[x] = find(p[x]);
//        }
//        return p[x];
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        for (int i=1; i<=n; i++) {
//            p[i] = i;
//        }
//
//        while (m-- != 0) {
//            String op = sc.next();
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//            if (op.equals("M")) {
//                // a的祖宗节点的父亲等于b的祖宗节点
//                p[find(a)] = find(b);
//            } else if (op.equals("Q")){
//                if (find(a) == find(b)) {
//                    System.out.println("Yes");
//                } else {
//                    System.out.println("No");
//                }
//            }
//        }
//
//    }

}
