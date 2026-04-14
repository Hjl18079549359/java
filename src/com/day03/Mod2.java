package com.day03;

import java.util.Scanner;

public class Mod2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("你要买几杯奶茶：");
        int a=sc.nextInt();
        System.out.println("奶茶价格：");
        int b=sc.nextInt();
        double x=sum(b,a);
        System.out.println("一共要付："+x+"元。");
    }
    public static double sum(double price,int num){
        if(num%2==0){
            return 0.5*num*price+0.5*num*price*0.5;
        }else {
            return (num/2+1)*price+num/2*price*0.5;
        }
//        double x=price+price*0.5*(num-1);
//        return x;
    }
}
