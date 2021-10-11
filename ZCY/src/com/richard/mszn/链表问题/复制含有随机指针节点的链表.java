package com.richard.mszn.链表问题;

import java.util.HashMap;

public class 复制含有随机指针节点的链表 {

    public NodeRand copyListWithRand1(NodeRand head) {

        HashMap<NodeRand, NodeRand> map = new HashMap<>();
        NodeRand cur = head;
        while (cur != null) {
            map.put(cur,new NodeRand(cur.value));
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }

        return map.get(head);

    }

}
class NodeRand{
    int value;
    NodeRand next;
    NodeRand rand;
    public NodeRand(int value) {
        this.value = value;
    }
}