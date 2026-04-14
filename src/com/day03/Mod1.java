package com.day03;

import java.util.Scanner;

public class Mod1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("输入边长1：");
//        int a=sc.nextInt();
//        System.out.println("输入边长2：");
//        int b=sc.nextInt();
//        int sum=get(a,b);
//        System.out.println("周长："+sum);
        System.out.println("请输入要删除的id号：");
        int id=sc.nextInt();

        remove(id);
    }
    public static int get(int a,int b){
        return 2*(a+b);
    }
    public static void remove(int id){
        if (id==10){
            System.out.println("已删除");
        }
    }
}
