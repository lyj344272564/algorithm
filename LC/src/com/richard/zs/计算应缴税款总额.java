package com.richard.zs;

public class 计算应缴税款总额 {
    public double calculateTax(int[][] brackets, int income) {
        double res = 0.0;
        int n = brackets.length;
        for (int i=0; i<n; i++) {
            if (i == 0) {
                if (brackets[i][0] > income) {
                    res += income * brackets[i][1] / 100.0;
                    break;
                } else {
                     res += brackets[i][0] * brackets[i][1] / 100.0;
                }
            } else {
                if (brackets[i][0] <= income) {
                    res += (brackets[i][0] - brackets[i-1][0]) * brackets[i][1] / 100.0;
                } else if (brackets[i][0] > income) {
                    res += (income-brackets[i-1][0]) * brackets[i][1]/100.0;
                    break;
                }
            }
        }
        return res;
    }

}
