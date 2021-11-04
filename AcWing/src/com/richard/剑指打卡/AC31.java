package com.richard.剑指打卡;

public class AC31 {
    public boolean isNumber(String s) {
        try {
            if(Double.valueOf(s.toString())!=null)
                return true;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }
}
