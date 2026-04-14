package com.day01;

import java.util.Scanner;

public class Do2Demo {
    public static void main(String[] args) {
        /*
        * 大巴车投币，要超过10元，才可以坐车
        * 可以一元一元的头，也可以2元，5元，10元
        * */
        Scanner sc=new Scanner(System.in);
        int i=0;
        do{
            System.out.println("请投币");
            int b=sc.nextInt();
            i=i+b;
            if (i>10){
                System.out.println("可以坐车了");
                break;
            }

        }while(true);
    }
}
