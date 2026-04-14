package com.day01;

import java.util.Scanner;

public class ScDemo {
//    导入包：本文件之外的一些功能包，要导入到本文件使用alt enter
    public static void main(String[] args) {
//       new Scanner(System.in)： 创建一个输入设备类的对象
//        sc 就具有输入设备的属性和方法了
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年龄：");
//        int age=sc.nextInt();
        String name=sc.next();
//        当有字符串时，+是连接符
//        System.out.println("你的年龄是："+age+"岁");
        System.out.println("姓名："+name);
    }
}
