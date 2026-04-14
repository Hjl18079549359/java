package com.day01;

public class ForDemo2 {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
           int j= i/100;//百位
           int m=i%100;
           int n=m/10;//十位
           int e=i%10;//个位
            if(j*j*j+n*n*n+e*e*e==i){
                System.out.println(i);
            }
        }
    }
}
