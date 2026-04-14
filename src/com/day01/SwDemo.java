package com.day01;

import java.util.Scanner;

public class SwDemo {
    public static void main(String[] args) {
//        输入数字
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入整数");
//        int i=scanner.nextInt();
        String s=scanner.next();
        String str="";
        switch (s){
            case "a":str="j";break;
            case "b":str="f";break;
            case "c":str="W";break;
            default:str="hjl";
        }
        System.out.println(str);
    }
}
