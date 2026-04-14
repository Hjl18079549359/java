package com.day01;

import java.util.Scanner;

public class W2Demo {
    public static void main(String[] args) {
//        double b1=Math.random();
//        System.out.println(b1);
        int x=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int gu=0;
        while(true){
            System.out.println("输入要猜的数字");
            gu= sc.nextInt();
            if (gu>x){
                System.out.println("猜大了");
            }else if(gu<x){
                System.out.println("猜小了");

            }else if(gu==x){
                System.out.println("猜对了666");
                break;
            }
        }
    }
}
