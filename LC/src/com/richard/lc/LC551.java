package com.richard.lc;

/**
 * 551. 学生出勤记录 I
 */
public class LC551 {

    public boolean checkRecord(String s) {

        int a = 0;
        int l = 0;
        for (int i=0,j=0; i<s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
                if (a>=2) {
                    return false;
                }
            }
            if (s.charAt(i) == 'L'){
                l++;
                if (l >= 3) {
                    return false;
                }
            } else { // 每次都让l归0
                l = 0;
            }
        }


        return true;
    }

}
