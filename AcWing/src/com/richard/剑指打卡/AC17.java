package com.richard.剑指打卡;

import java.util.Stack;

/**
 * 17. 从尾到头打印链表
 */
public class AC17 {

    public int[] printListReversingly(ListNode head) {
//        这里不可以后特判 因为如果特哦按泽输出错误 输出是数组
        if (head == null) {
            return new int[]{};
        }
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        int cnt = 0;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
            cnt++;
        }

        int[] res = new int[cnt];
        int i = 0;
        while (!stack.isEmpty()) {
            res[i++] = stack.pop();
        }
        return res;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
    }
}
