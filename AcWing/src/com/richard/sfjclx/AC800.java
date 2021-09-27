package com.richard.sfjclx;


import java.io.*;
import java.util.Scanner;

/**
 * 800. 数组元素的目标和
 */
public class AC800 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] val = br.readLine().split(" ");

        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);
        int x = Integer.parseInt(val[2]);

        int[] a = new int[n];
        int[] b = new int[m];

        String[] curA = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(curA[i]);
        }

        String[] curB = br.readLine().split(" ");
        for (int i=0; i<m; i++) {
            b[i] = Integer.parseInt(curB[i]);
        }

        for (int i=0,j=m-1; i<n; i++) {
            while (j>0 && (x<a[i]+b[j])) {
                j--;
            }
            if (j>=0 && x==a[i]+b[j]) {
//                System.out.println(i + " " + j);
                bw.write(i + " " + j);
               break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }


//
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int x = sc.nextInt();
//
//        int[] a = new int[n];
//        int[] b = new int[m];
//
//        for (int i=0; i<n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int j=0; j<m; j++) {
//            b[j] = sc.nextInt();
//        }
//
//        for (int i=0,j=m-1; i<n; i++) {
//            // 这里j 不能=0 里面一减就是-1此时就会越界
//           while (j>0 && (x < a[i] + b[j])) {
//               j--;
//           }
//           if (j>=0 && a[i]+b[j] == x) {
//               System.out.println(i+" "+j);
//               return;
//           }
//        }
//
//
//    }

}
