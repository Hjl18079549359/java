package com.day0414;

import java.util.Scanner;

//参数异常
public class E5 {
//    输入用户名，规定大于6位数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名和密码");
        String str=sc.next();
        String b=sc.next();
        check(str,b);

    }
    public static void check(String userName,String password){
        if(userName.length()<6){
            throw new IllegalArgumentException("用户名不少于6位");
        }else {
            System.out.println("用户名正常");
        }
    }
}
