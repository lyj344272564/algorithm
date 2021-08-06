package com.richard;



import java.util.*;

/**
 * AcWing 3793. 最大分数
 */
public class AC3793 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
//            List<Integer> al = new ArrayList<>();

            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
//                al.add(a[i]);
            }

//            Collections.sort(al);

            Arrays.sort(a);

            int res = 0;

            for (int i=0; i<m; i++) {

                if (a[i]<0) {
                    res += Math.abs(a[i]);
                } else if (a[i]>0){
                    break;
                }
            }

            System.out.println(res);

        }

    }

}
