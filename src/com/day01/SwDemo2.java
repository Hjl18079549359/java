package com.day01;

import java.util.Scanner;

public class SwDemo2 {
    public static void main(String[] args) {
//        输入数字
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入整数");
//        int i=scanner.nextInt();
        String s=scanner.next();
        String str="";
        switch (s){
            case "a":str="j";
                System.out.println(str);
            case "b":str="f";
                System.out.println(str);
            case "c":str="W";
                System.out.println(str);
            default:str="hjl";
        }
        System.out.println(str);
    }
}
