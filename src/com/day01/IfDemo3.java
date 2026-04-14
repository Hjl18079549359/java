package com.day01;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        /*
        * 三元运算符
        * */
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入总行数：");
        int num=scanner.nextInt();
        System.out.println("页面容量：");
        int num2=scanner.nextInt();
        int re=num%num2==0?(num/num2):(num/num2)+1;
        System.out.println(re);
    }
}
