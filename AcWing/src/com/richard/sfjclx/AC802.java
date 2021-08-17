package com.richard.sfjclx;

import java.util.*;

/**
 * 802. 区间和
 */
public class AC802 {

    private static final int N = 300010;
    private static int[] a = new int[N]; // 要存的数
    private static int[] s = new int[N]; // 前缀和
    private static List<Integer> all = new ArrayList<>(); // 存的所有要离散化的值
    private static List<int[]> add  = new ArrayList<>();
    private static List<int[]> query = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i=0; i<n; i++) {

            int x = sc.nextInt();
            int c = sc.nextInt();

            add.add(new int[] {x, c});
            all.add(x);

        }

        for (int i=0; i<m; i++) {

            int l = sc.nextInt();
            int r = sc.nextInt();

            query.add(new int[] {l,r});

            all.add(l);
            all.add(r);
        }

        // 去重
        Collections.sort(all);
        int cnt = 1 ;
        for (int i = 1 ; i < all.size() ; ++i) {

            if (all.get(i) != all.get(i - 1)) {
                all.set(cnt++, all.get(i)) ;
            }

        }
        while (all.size() != cnt) {
            all.remove(all.size() - 1) ;
        }


        // 处理插入
        for (int [] ad : add) {
            int x = find(ad[0]) ;
            a[x] += ad[1] ;
        }

        // System.out.println(all.size());
        // 预处理前缀和
        for (int i = 1 ; i <= all.size() ; ++i) {
            s[i] = s[i - 1] + a[i] ;
        }

        // 处理询问
        for (int [] q : query) {
            int l = find(q[0]);
            int r = find(q[1]);
            System.out.println(s[r] - s[l - 1]) ;
        }

    }

    private static int find (int x) {

        int l = 0;
        int r = all.size() - 1;

        while (l < r) {

            int mid = l+r >> 1;
            if (all.get(mid)>= x) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }
        return r + 1;
    }

}
