package com.day01;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a=scanner.nextInt();
        int b=a/3600;//时
        int c=a%3600;
        int e=c/60;//分
        int d=a%60;//秒
        System.out.println("时："+b+"分："+e+"秒："+d);
    }
}
