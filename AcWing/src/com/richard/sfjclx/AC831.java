package com.richard.sfjclx;

import java.io.*;

/**
 * 831. KMP字符串
 * s母 p子
 */
public class AC831 {

    static int N = 100010;
    static int ne[] = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer n = Integer.parseInt(br.readLine());
        String s1 = " " + br.readLine();
        Integer m = Integer.parseInt(br.readLine());
        String s2 = " " + br.readLine();
        char[] p = s1.toCharArray();
        char[] s = s2.toCharArray();


        //ne  n
        for (int i=2,j=0; i<=n; i++) {
            while (j!=0 && p[i]!=p[j+1]) {
                j = ne[j];
            }
            if (p[i] == p[j+1]) {
                j++;
            }
            ne[i] = j;
        }

        // 匹配 m
        for (int i=1,j=0; i<=m; i++) {
            while (j!=0 && s[i]!=p[j+1]) {
                j = ne[j];
            }
            if (s[i] == p[j+1]) {
                j++;
            }
            if (j == n) {
                j = ne[j];
                bw.write(i-n + " ");
            }

        }

        bw.flush();
    }


//
//
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Integer n = Integer.parseInt(br.readLine());
//        String s1 = " " + br.readLine();
//        Integer m = Integer.parseInt(br.readLine());
//        String s2 = " " + br.readLine();
//        char[] p = s1.toCharArray();
//        char[] s = s2.toCharArray();
//        /**
//         * ne[]：存储一个字符串以每个位置为结尾的‘可匹配最长前后缀’的长度。
//         * 构建ne[]数组：
//         *              1,初始化ne[1] = 0,i从2开始。
//         *              2,若匹配，s[i]=s[j+1]说明1~j+1是i的可匹配最长后缀,ne[i] = ++j;
//         *              3,若不匹配，则从j的最长前缀位置+1的位置继续与i比较
//         *              (因为i-1和j拥有相同的最长前后缀，我们拿j的前缀去对齐i-1的后缀),
//         *              即令j = ne[j],继续比较j+1与i，若匹配转->>2
//         *              4,若一直得不到匹配j最终会降到0，也就是i的‘可匹配最长前后缀’的长度
//         *              要从零开始重新计算
//         */
//        for(int i=2, j=0; i<=n; i++) {
//            // 回退
//            while(j!=0 && p[i]!=p[j+1]) {
//                j = ne[j];
//            }
//            // 回退之后可不可以往后走
//            if(p[i] == p[j+1]) {
//                j++;
//            }
//            ne[i] = j;
//        }
//        /**
//         * 匹配两个字符串：
//         *      1，从i=1的位置开始逐个匹配，利用ne[]数组减少比较次数
//         *      2，若i与j+1的位置不匹配（已知1~j匹配i-j~i-1)，
//         *      j跳回ne[j]继续比较(因为1~j匹配i-j~i-1,所以1~ne[j]也能匹配到i-ne[j]~i-1)
//         *      3，若匹配则j++,直到j==n能确定匹配成功
//         *      4，成功后依然j = ne[j],就是把这次成功当成失败，继续匹配下一个位置
//         */
//        for(int i = 1,j = 0; i <= m;i++) {
//            while(j!=0 && s[i]!=p[j+1]) {
//                j = ne[j];
//            }
//            if(s[i] == p[j+1]) {
//                j++;
//            }
//            if(j == n) {
//                j = ne[j];
//                bw.write(i-n+" ");
//            }
//        }
//        /**
//         * 时间复杂度：
//         *      因为：j最多加m次，再加之前j每次都会减少且最少减一，j>0
//         *      所以：while循环最多执行m次,若大于m次，j<0矛盾
//         *      最终答案：O(2m)
//         */
//        bw.flush();
//    }
//


}
