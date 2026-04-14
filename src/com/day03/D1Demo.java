package com.day03;

import java.util.Scanner;

public class D1Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int x=sum(y);
        System.out.println(x);
    }
    public static int sum(int a){
        if(a==1){
            return 1;
        }else {
            return a+sum(a-1);
        }
    }
}
