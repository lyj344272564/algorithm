package com.richard;

public class asdsa {

    public long arrayGame(int[] arr) {
        // write your code here
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        int result = 0;
        for (int num : arr) {
            result += num - min;
        }
        return result;

    }
}
