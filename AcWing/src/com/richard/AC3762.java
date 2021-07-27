package com.richard;


import java.util.Scanner;

public class AC3762 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- != 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            int[][]  a  = new int[110][110];
            int res =  0;

            for (int i=1; i<=m; i++)  {
                for (int j=1;j<=n; j++) {
                    a[i][j] = sc.nextInt();
                    if (a[i][j] == 1) {
                        res += 3;
                    }
                }
            }
            System.out.println(res);
            for(int i=1; i<=n; i++) {
                for (int j=1; j<=m; j++) {
                    if (a[i][j] == 1){
                        if (i<n && i<m) {
                            pL(i,j,0);
                            pL(i,j+1,1);
                            pL(i+1,j,3);
                        } else if (i==n&&j==n) {
                            pL(i,j,2);
                            pL(i-1,j,1);
                            pL(i,j-1,3);
                        } else if (i==n) {
                            pL(i-1,j,0);
                            pL(i,j,3);
                            pL(i,j+1,2);
                        }  else {
                            pL(i,j-1,0);
                            pL(i,j,1);
                            pL(i+1,j,2);
                        }
                    }
                }
            }
        }
    }

    public static void pL(int i, int j, int k) {
        if (k == 0) {
            System.out.println(i + " " + j + " " + (i+1) + " " + j + " " + i + " " + (j+1));
        } else if  (k == 1) {
            System.out.println(i + " " + (j-1) + " " + i + " " + j + " " + (i+1) + " " + j);
        } else if (k == 2) {
            System.out.println((i-1) + " " + j + " " + i + " " + j + " " + i + " " + (j-1));
        } else if (k == 3) {
            System.out.println((i-1) + " " + j + " " + i + " " + j + " " + i + " " + (j+1));
        }
    }

}
