package com.richard.剑指打卡;

public class AC85 {

    public int add(int num1, int num2) {

        while (0 != num2) {
            int temp = num1^num2;
            num2 = (num1&num2) << 1;
            num1 = temp;
        }
        return num1;
    }
}
