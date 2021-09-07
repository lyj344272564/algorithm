package ciom.richard;



import java.util.*;

public class 灰度直方图 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int L = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int[] h = new int[L];
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                int cnt = 1;
                if (map.containsKey(a[i][j])) {
                    map.put(a[i][j],map.get(a[i][j])+1);
                } else {
                    map.put(a[i][j],1);
                }
            }
        }

        int []ans = new int[L];
        //将map里面的值拿出来，因为map里都是对象类型，所以要用相应的ArrayList存储
        ArrayList<Integer> keyArr = new ArrayList<Integer>(map.keySet());
        ArrayList<Integer> valueArr = new ArrayList<Integer>(map.values());

        for (int i = 0; i < keyArr.size(); i++) {
            ans[keyArr.get(i)] = valueArr.get(i);
        }
        for (int i = 0; i < L; i++) {
            System.out.print(ans[i]+" ");
        }

    }

}
