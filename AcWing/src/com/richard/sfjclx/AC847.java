package com.richard.sfjclx;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 847. 图中点的层次
 */

public class AC847 {

        private static final int N = 100010;

        private static int idx, n, m;

        private static int[] h = new int[N], e = new int[N], ne = new int[N], d = new int[N], q = new int[N];

        public static void main(String[] args) throws IOException, IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] str1 = reader.readLine().split(" ");
            n = Integer.parseInt(str1[0]);
            m = Integer.parseInt(str1[1]);
            for (int i = 0; i < h.length; i++) {
                h[i] = -1;
            }
            for (int i = 0; i < m; i++) {
                String[] str2 = reader.readLine().split(" ");
                add(Integer.parseInt(str2[0]), Integer.parseInt(str2[1]));
            }
            System.out.println(bfs());
            reader.close();
        }

        private static void add(int a, int b) {
            e[idx] = b;
            ne[idx] = h[a];
            h[a] = idx++;
        }

        private static int bfs() {
            int hh = 0, tt = 0;
            q[0] = 1;
            for (int i = 0; i < d.length; i++) {
                d[i] = -1;
            }
            d[1] = 0;
            while (hh <= tt) {
                int t = q[hh++];
                for (int i = h[t]; i != -1; i = ne[i]) {
                    int j = e[i];
                    if (d[j] == -1) {
                        d[j] = d[t] + 1;
                        q[++tt] = j;
                    }
                }
            }
            return d[n];
        }

    }

