package com.richard.剑指打卡;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class AC64 {
    Map<Character,Integer> map = new HashMap<>();
    Queue<Character> q = new LinkedList<>();
    //Insert one char from stringstream
    public void insert(char ch){
        if (map.containsKey(ch)) {
            int value = map.get(ch);
            map.put(ch,++value);
        } else {
            map.put(ch,1);
        }
        q.offer(ch);
        while(!q.isEmpty() && map.get(q.peek())>1){
            q.poll();
        }
    }

    //return the first appearence once char in current stringstream
    public char firstAppearingOnce(){
        return q.isEmpty()?'#':q.peek();
    }
}
