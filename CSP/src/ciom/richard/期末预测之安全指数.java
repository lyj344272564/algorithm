package ciom.richard;


import java.util.Scanner;

public class 期末预测之安全指数 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = 0;

        while (n-- != 0) {

            int w = sc.nextInt();
            int score = sc.nextInt();

            res += w*score;

        }

        System.out.println((res>0)?res:0);

    }

}
