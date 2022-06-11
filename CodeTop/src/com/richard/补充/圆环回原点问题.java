package com.richard.补充;

/**
 * 0-12共13个数构成一个环，从0出发，每次走1步，走n步回到0共有多少种走法（2020.09 字节跳动-广告-后端）[1]
 * 0-8组成一个圆环，从0出发，每次可以逆时针和顺时针走，走n步能回到0有多少种情况（2020.09 字节跳动-people-后端）[2]
 * 0~9的环，从0出发，N步后能否走回0。（2020.07 字节跳动-电商-后端）[3]
 * 圆环回原点问题 (2020.08 字节跳动-飞书-后端)[4]
 */

/**
 * 圆环上有10个点，编号为0~9。从0点出发，每次可以逆时针和顺时针走一步，问走n步回到0点共有多少种走法。
 * 输入：2
 * 返回：2
 * 解释：有2种方案。分别是0->1->0和0->9->0
 */
public class 圆环回原点问题 {
    public static void main(String[] args) {
        int res = backToOrigin(10, 2);
        System.out.println(res);
    }
    public static int backToOrigin(int length, int n) {
        int[][] dp = new int[n+1][length];
        dp[0][0] = 1;
        for (int i=1; i<=n; i++) {
            for (int j=0; j<length; j++) {
                // dp[i][j]表示从0出发，走i步到j的方案数
                // 公式之所以取余是因为j-1或j+1可能会超过圆环0~9的范围
                dp[i][j] = dp[i-1][(j-1+length)%length] + dp[i-1][(j+1)%length];
            }
        }
        return dp[n][0];
    }
}
