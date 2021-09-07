package ciom.richard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Spot implements Comparable<Spot>{
    int index;	//用于标记是哪个检测点
    double D;	//存储监测点到人的距离
    public Spot(int index, double len) {
        super();
        this.index = index;
        this.D = len;
    }
    public int getIndex() {
        return index;
    }
    public double getLen() {
        return D;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setLen(double len) {
        this.D = len;
    }
    @Override
    public int compareTo(Spot o) {
        if(this.D<o.D)
            return -1;
        else if(this.D==o.D)
            return 0;
        else
            return 1;
    }


}

public class 称检测点查询 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        ArrayList<Spot> spots = new ArrayList<Spot>();


        for (int i=0; i<n; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();

            double len =  Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
            spots.add(new Spot(i+1,len));
        }

        Collections.reverse(spots);

        for (int i=0; i<3; i++) {
            System.out.println(spots.get(i).index);
        }


    }

}
