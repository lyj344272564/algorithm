package com.richard.mszn.链表问题;

public class 在双链表中删除倒数第k个节点 {

    public static DoubleNode removeLastKthNode(DoubleNode head, int lastKth) {

        if (head == null || lastKth < 1) {
            return head;
        }

        DoubleNode cur = head;

        while (cur != null) {
            lastKth--;
            cur = cur.next;
        }

        if (lastKth == 0) {
            head = head.next;
            head.last = null;
        }

        if (lastKth < 0) {
            cur = head;
            while (++lastKth != 0) {
                cur = cur.next;
            }
            //newNode是要删除的下一个  要回指所以需要记录要删除的下一个
            DoubleNode newNode = cur.next.next;
            cur.next = newNode;
            // 判断要删除的下一个是否是空   不为空则需要前指
            if (newNode != null) {
                newNode.last = cur;
            }
        }
        return head;
    }

}
class DoubleNode{
    public int value;
    public DoubleNode next;
    public DoubleNode last;
    public void DoubleNode(int value) {
        this.value = value;
    }
}
