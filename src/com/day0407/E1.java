package com.day0407;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try {//尝试
            int[] arr=new int[a];
            System.out.println("数组下标要>=0");
        }catch (NegativeArraySizeException e){//有问题时
            System.out.println("数组下标要为大于0的数");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界了");
        }finally {
            System.out.println("总体程序是正常向下运行了，不用太担心");
        }

    }
}
