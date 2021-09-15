package com.richard.sfjclx;

import java.util.*;

/**
 * 845. 八数码
 */
public class AC845 {

    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        String str = "";

        for (int i = 0; i < 9; i ++){
            str += cin.next();
        }

        System.out.print(bfs(str));

    }

    static int bfs(String str){

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        Queue<String> q = new LinkedList<>();

        q.add(str);
        map.put(str, 0);

        while (!q.isEmpty()){

            String t = q.remove();

            if (t.equals("12345678x")) {
                return map.get(t);
            }

            int pos = t.indexOf('x');

            // 以为数组下标转化为二维数组下标
            int x = pos / 3;
            int y = pos % 3;

            for (int i = 0; i < 4; i ++){
                int tx = x + dx[i];
                int ty = y + dy[i];

                // 边界判断
                if (tx < 0 || tx >= 3 || ty < 0 || ty >= 3) {
                    continue;
                }

                String tstr = makeStr(t, pos, tx * 3 + ty);
                if (map.containsKey(tstr)) {
                    continue;
                }

                map.put(tstr, map.get(t) + 1);
                q.add(tstr);
            }
        }

        return -1;
    }

    static String makeStr(String t, int src, int dest){

        StringBuilder str = new StringBuilder(t);

        str.setCharAt(src, t.charAt(dest));
        str.setCharAt(dest, 'x');

        return str.toString();
    }

}
