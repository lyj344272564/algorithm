package com.richard.sfjclx;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 798. 差分矩阵
 */
public class AC798 {

    private static final int N = 1010;
    private static int[][] a = new int[N][N];
    private static int[][] b = new int[N][N];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] val = bf.readLine().split(" ");

        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);
        int q = Integer.parseInt(val[2]);

        for (int i=1; i<=n; i++) {
            String[] cur = bf.readLine().split(" ");
            for (int j=1; j<=m; j++) {
                a[i][j] = Integer.parseInt(cur[j-1]);
                insert(i,j,i,j,a[i][j]);
            }
        }

        while (q-- != 0) {
            String[] cur1 = bf.readLine().split(" ");

            int x1 = Integer.parseInt(cur1[0]);
            int y1 = Integer.parseInt(cur1[1]);
            int x2 = Integer.parseInt(cur1[2]);
            int y2 = Integer.parseInt(cur1[3]);

            int c = Integer.parseInt(cur1[4]);

            insert(x1,y1,x2,y2,c);

        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                b[i][j] += b[i-1][j] + b[i][j-1] - b[i-1][j-1];
            }
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


    }

    private static void insert(int x1, int y1, int x2, int y2, int c) {
        b[x1][y1] += c;
        b[x2+1][y1] -= c;
        b[x1][y2+1] -= c;
        b[x2+1][y2+1] += c;
    }

}
