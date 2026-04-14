package com.day0414;

import java.util.Arrays;
import java.util.Scanner;

public class SystemDemo {
    public static void main(String[] args) throws InterruptedException {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("输两个数字");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a*b:"+ a*b);
        System.exit(0);
        System.out.println("c");*/

        System.out.println(System.currentTimeMillis());//计算程序时间段
        Thread.sleep(10);
        System.out.println(System.currentTimeMillis());

        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{8,9,5,7};
        int[] arr3=new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);//源、源起点、目标、目标起点、长度
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}
