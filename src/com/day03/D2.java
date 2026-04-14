package com.day03;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sum(sc.nextInt());
        System.out.println(x);
    }
    public static int sum(int  a){
        if (a==2){
            return 3;
        } else if (a%2==0){
            return a+sum(a-2);
        } else {
            return a-1+sum(a-3);
        }
    }
}
