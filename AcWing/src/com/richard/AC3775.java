package com.richard;


import java.util.Scanner;

/**
 *
 AcWing 3775. 数组补全
 */
public class AC3775 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            int[] p = new int[n+10];   //p[i]=j表示i的下一个节点是j
            int[] q = new int[n+10];   //p[i]=j表示i的上一个节点是j，即j节点指向i
            boolean[] st = new boolean[n+10];   //每个节点是否已经加入到环图中
            boolean flag = false;


            for(int i = 1;i <= n;i++) {
                p[i] = sc.nextInt();
                q[p[i]] = i;
            }


            for(int i = 1;i <= n;i++) {

                if(st[i] || p[i] == 0) {   //i已经加入到环中，或者p[i]=0
                    continue;
                }
                st[i] = true;
                int x = i; // 头
                int y = i; // 尾

                while(p[x] != 0 && !st[p[x]]) { //将p[x]加入环中
                    x = p[x];
                    st[x] = true;
                }

                while(q[y] != 0 && !st[q[y]]) {  //将q[y]加入环中
                    y = q[y];
                    st[y] = true;
                }

                if(p[x] == y) {   //已经是一个完整的环
                    continue;
                }

                if (!flag) { //将所有孤立的节点(p[j]=0,q[j]=0)加入该环中，形成完整的环
                    flag = true;
                    for (int j=1; j<=n; j++) {
                        if (p[j] == 0 && q[j] == 0) {
                            st[j] = true;
                            p[x] = j;
                            x = j;
                        }
                    }
                }
                p[x] = y;
            }
            if (!flag) {//将其余的节点(p[i]=0)的节点加入其它的环中
                int x = 0, y = 0;
                for (int i=1; i<=n; i++) {
                    if (p[i] == 0) {
                        if (x==0 && y==0){
                            x = i;
                            y = i;
                        }
                        else {
                            p[x] = i;
                            x = i;
                        }
                    }
                }
                p[x] = y;
            }
            for (int i=1; i<=n; i++) {
                System.out.print(p[i]+" ");
            }
            System.out.println();
        }

    }
}
