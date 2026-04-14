package com.day01;

import java.util.Scanner;

public class HouseWork01 {
    //        作业1：有36个物品，有36个人，人中有成年男，成年女，小孩
    //成年男每次运四个物品，成年女，每次运三个物品，二个小孩共运一个物品，
    //一次所有人都运，正好运完，问多少成年男 成年女 小孩。
//    public static void main(String[] args) {
//        for (int i = 1; i <9 ; i++) {
//            for (int j = 1; j <12; j++) {
//                int x=36-i-j;
//                if(i*4+j*3+x/2==36 && x%2==0){
//                    System.out.println("成年男："+i+"人；成年女："+j+"人；小孩："+x+"人");
//                }
//            }
//        }
//    }
//   作业2：
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#  ");
            }
            for (int j = 0; j <5-i; j++) {
                System.out.print("%  ");
            }
            System.out.println();
        }
    }
//    作业3：请输入一个整数，通过循环，把此数倒过来输出
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个数：");
//        int a=sc.nextInt();
//        int re=0;
//        while (a>0){
//            int c=a%10;
//            a=a/10;
//            re=re*10+c;
//        }
//        System.out.println("该数的逆序："+re);
//    }
}
