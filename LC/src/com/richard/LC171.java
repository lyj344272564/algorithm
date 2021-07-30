package com.richard;



public class LC171 {
    public static void main(String[] args) {
        int i = titleToNumber("ZY");
        System.out.println(i);

    }

    public static int titleToNumber(String columnTitle) {

        if (columnTitle.isEmpty()) {
            return  0;
        }

        int num = 0;

        char[] c = columnTitle.toCharArray();
        int n = c.length;

        for (int i=n-1,j=1; i>=0; i--,j*=26) {

            if (c[i]<'A' || c[i]>'Z') return 0;

            num += (c[i]-64)*j;
        }

        return num;
    }
}
