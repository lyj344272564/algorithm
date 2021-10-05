package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 854. Floyd求最短路
 */
public class AC854 {
//
//    static final int N = 250;
//    static int[][] g = new int[N][N];
//    static int n, m;
//    static int max = 0x3f3f3f;
//
//    static void floyd() {
//
//        for (int k=1; k<=n; k++) {
//            for (int i=1; i<=n; i++) {
//                for (int j=1; j<=n; j++) {
//                    g[i][j] = Math.min(g[i][j],g[i][k] + g[k][j]);
//                }
//            }
//        }
//
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] val = br.readLine().split(" ");
//
//        n = Integer.parseInt(val[0]);
//        m = Integer.parseInt(val[1]);
//        int k = Integer.parseInt(val[2]);
//
//        for (int i=1; i<n; i++) {
//            for (int j=1; j<=n; j++){
//                if (i==j) {
//                    g[i][j] = 0;
//                } else {
//                    g[i][j] = max;
//                }
//            }
//        }
//
//        for (int i=0; i<m; i++) {
//
//            String[] cur = br.readLine().split(" ");
//            int a = Integer.parseInt(cur[0]);
//            int b = Integer.parseInt(cur[1]);
//            int c = Integer.parseInt(cur[2]);
//
//            g[a][b] = Math.min(g[a][b], c);
//        }
//
//        floyd();
//
//        for(int i=0; i<k; i++){
//            String[] cur = br.readLine().split(" ");
//            int a = Integer.parseInt(cur[0]);
//            int b = Integer.parseInt(cur[1]);
//
//            if(g[a][b] >= max/2) {
//                System.out.println("impossible");
//            } else {
//                System.out.println(g[a][b]);
//            }
//
//        }
//
//    }


    static int N = 250;
    static int[][] g = new int[N][N];
    static int n,m;
    static int max = 0x3f3f3f3f;

    static void floyd(){
        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    g[i][j] = Math.min(g[i][k]+g[k][j], g[i][j]);
                }
            }
        }
    }

    public static void main(String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = in.readLine().split(" ");
        n = Integer.parseInt(arr[0]);
        m = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);

        for(int i=1; i<=n ;i++){
            for(int j=1; j<=n; j++){
                if(i==j) g[i][j]=0;
                else g[i][j] = max;
            }
        }

        for(int i=0; i<m; i++){
            String[] cur = in.readLine().split(" ");
            int a = Integer.parseInt(cur[0]);
            int b = Integer.parseInt(cur[1]);
            int c = Integer.parseInt(cur[2]);

            g[a][b] = Math.min(c, g[a][b]);
        }

        floyd();

        for(int i=0; i<k; i++){
            String[] cur = in.readLine().split(" ");
            int a = Integer.parseInt(cur[0]);
            int b = Integer.parseInt(cur[1]);

            if(g[a][b] >= max/2) {
                System.out.println("impossible");
            } else {
                System.out.println(g[a][b]);
            }
        }
    }

}
