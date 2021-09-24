package com.richard.sfjclx;

import java.io.*;

/**
 * AcWing 788. 逆序对的数量
 */
public class AC788 {

    private static int N = 100010;
    private static int[] q = new int[N];
    // 临时数组
    private static int[] temp = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] val = bf.readLine().split(" ");

        int n = Integer.parseInt(val[0]);

        String[] cur = bf.readLine().split(" ");
        for (int i=0; i<n; i++) {
            q[i] = Integer.parseInt(cur[i]);
        }


        long ans = merge_sort(0,n-1);

//        bw.write((int)ans);
        System.out.println(ans);


    }

    public static long merge_sort(int l, int r) {

        if (l >= r) {
            return 0;
        }

        int mid = l + r >> 1;

        long res = merge_sort(l,mid) + merge_sort(mid+1,r);

        int k = 0;
        int i = l;
        int j = mid + 1;

        while (i <= mid && j <= r) {

            if (q[i] <= q[j]) {
                temp[k++] = q[i++];
            } else {
                temp[k++] = q[j++];

                res += mid - i + 1;

            }
        }

        while (i <= mid) {
            temp[k++] = q[i++];
        }

        while (j <= r) {
            temp[k++] = q[j++];
        }

        for (i=l,j=0; i<=r; i++,j++) {
            q[i] = temp[j];
        }

        return res;
    }

}
