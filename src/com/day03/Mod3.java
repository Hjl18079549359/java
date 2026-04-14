package com.day03;

import java.util.Objects;
import java.util.Scanner;

public class Mod3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("四则运算");
        while (true){
            System.out.println("输入第一个输：");
            int a=sc.nextInt();
            if (a==666){
                System.out.println("结束");
                break;
            }
            System.out.println("输入第二个输：");
            int b=sc.nextInt();
            System.out.println("输入运算符：");
            String c=sc.next();
            System.out.println(mov(a,b,c));
        }
    }
    public static double mov(int num1,int num2,String str){
        if(str=="+"){
            return num1+num2;
        } else if (str=="-") {
            return num1-num2;
        } else if (str=="*") {
            return num1*num2;
        }else {
            return num1/num2;
        }

    }
}
