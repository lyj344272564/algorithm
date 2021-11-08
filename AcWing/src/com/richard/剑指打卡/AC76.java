package com.richard.剑指打卡;

import java.util.ArrayList;
import java.util.List;

public class AC76 {

    public List<List<Integer>> findContinuousSequence(int sum) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i=1,j=1,s=1; i<=sum; i++) {
            while (s<sum) {
                s += ++j;
            }
            if (s==sum && j-i+1>1) {
                List<Integer> list = new ArrayList<>();
                for (int k=i; k<=j; k++) {
                    list.add(k);
                }
                res.add(list);
            }
            s -= i;
        }
        return res;
    }
}
