package com.richard.tiku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 17. 从尾到头打印链表
 */
public class AC17 {

    public static void main(String[] args) {

    }
    public int[] printListReversingly(ListNode head) {

        List<Integer> res = new ArrayList<>();


        while (head != null) {
            res.add(head.val);
            head = head.next;
        }

        Collections.reverse(res);
        int[] a = new int[res.size()];
        for (int i=0; i<res.size(); i++) {
            a[i] = res.get(i);
        }
        return a;
    }

}
