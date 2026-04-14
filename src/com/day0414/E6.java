package com.day0414;

import java.util.Scanner;
//自定义异常
public class E6 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名");
            String n=sc.next();
            inputUserName(n,"huang","2025-06-12");
        }catch (MyExe e){
            System.out.println(e.getMessage());
        }
    }
    public static void inputUserName(String userName,String author,String time) throws MyExe {
        if (userName.length()<6){
            throw new MyExe(userName,author,time);
        }else {
            System.out.println("用户名正常");
        }
    }
}
//用户名长度  操作者  时间---提示信息
class MyExe extends Exception {
    String msg;
    String author;
    String time;
    public MyExe(){}
    public MyExe(String msg, String author, String time) {
        this.msg = msg;
        this.author = author;
        this.time = time;
    }
//    Exception 默认有个方法getMessage()重写
    public String getMessage() {
        return "异常信息，是用户名有问题"+this.msg+"\n操作者是："+this.author+"\n操作时间"+this.time;
    }
}