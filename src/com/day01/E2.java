package com.day01;

public class E2 {
    public static void main(String[] args) {
        int m=12;
        int n=5;
//        n=m%(m*n);
//        m=n%(m*n);
//        n=m+n;
//        m=n-m;
//        n=n-n;
        m=m+n;//汇总法
        n=m-n;
        m=m-n;
        System.out.println(m);
        System.out.println(n);
    }
}
