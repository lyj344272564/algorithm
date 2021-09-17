package com.richard.剑指打卡;

import java.util.*;

/**
 * 53. 最小的k个数
 * https://blog.csdn.net/weixin_41276957/article/details/104342145
 *
 *
 */
public class AC53 {
//
//    public List<Integer> getLeastNumbers_Solution(int [] input, int k) {
//
//        quick_start(input,0,input.length-1);
//        List<Integer> res = new ArrayList<>();
//        for (int i=0; i<k; i++) {
//            res.add(input[i]);
//        }
//        return res;
//    }
//
//    public static void quick_start(int[] q, int l, int r) {
//        if (l>=r) {
//            return ;
//        }
//
//        int x = q[l];
//        int i = l - 1;
//        int j = r + 1;
//
//        while (i < j) {
//            do {
//                i++;
//            } while (q[i] < x);
//            do {
//                j--;
//            } while (q[j] > x);
//            if (i < j) {
//                int temp = q[i];
//                q[i] = q[j];
//                q[j] = temp;
//            }
//        }
//        quick_start(q,l,j);
//        quick_start(q,j+1,r);
//    }
    public List<Integer> getLeastNumbers_Solution(int [] input, int k) {

        LinkedList<Integer> res = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));

        for (int x : input) {
            pq.offer(x);
            if (pq.size()>k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            res.addFirst(pq.poll());
        }

        return res;
    }
    /**
     * @Test
     * public void testPriorityQueue(){
     *     //默认采用的是最小堆实现的
     *     PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10,new Comparator<Integer>(){
     *         public int compare(Integer a, Integer b){
     *             return a-b; //if a>b 则交换，so这是递增序列
     *         }
     *     });
     *     queue.offer(13);
     *     queue.offer(9);
     *     int len = queue.size();
     *     for(int i=0;i<len;i++){
     *         System.out.println(queue.poll());
     *     }
     *     //输出 9  13
     *     //默认采用的是最小堆实现的
     *     PriorityQueue<Integer> queue2 = new PriorityQueue<>(10);
     *     queue2.offer(11);
     *     queue2.offer(9);
     *     len = queue2.size();
     *     for(int i=0;i<len;i++){
     *         System.out.println(queue2.poll());
     *     }
     *     //输出 9， 11
     *     }
     */

}
