package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * AcWing 3792. 质数问题
 */
public class AC3792 {

    static int N=1010;
    static int[] prime=new int[N];
    static boolean[] st=new boolean[N];
    static int p=0;


    static void getPrime(){
        for(int i=2;i<=500;i++){
            if(!st[i]){
                prime[p++]=i;
            }
            for(int j=0;prime[j]<=500/i;j++){
                st[prime[j]*i]=true;
                if(i%prime[j]==0) {
                    break;
                }
            }
        }
    }

    static boolean isPrime(int n){
        if(n<2) {
            return false;
        }
        for(int i=2;i<=n/i;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        getPrime();

        while(T-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int cnt=0;
            for(int i=0;i<p-1;i++){
                int t=prime[i]+prime[i+1]+1;
                if(t>n) break;
                if(isPrime(t)){
                    cnt++;
                }
            }
            System.out.println(cnt>=k?"YES":"NO");

        }


    }

}
