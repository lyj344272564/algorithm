package com.richard.sjmryt2021;



import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * AcWing 3785. 战舰
 */
public class AC3785 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = reader.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        char[][] chars = new char[n][n];

        for (int i=0; i<n; i++) {
            chars[i] = reader.readLine().toCharArray();
        }

        int x = 1, y = 1, res = 0;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {

                if (chars[i][j] == '#') {
                    continue;
                }

                int t = 0;
                int l = j, r = j;

                while (l>=0 && chars[i][l]!='#' && j-l+1<=k) {
                    l--;
                }
                while (r<n && chars[i][r]!='#' && r-j+1<=k) {
                    r++;
                }

                t += Math.max(0,r-l-k);

                l = r = i;
                while (l>=0 && chars[l][j]=='.' && i-l+1<=k) {
                    l--;
                }
                while (r<n && chars[r][j]=='.' && r-i+1<=k) {
                    r++;
                }
                t += Math.max(0,r-l-k);

                if (t>res) {
                    res = t;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(x + " " + y);


    }

}
