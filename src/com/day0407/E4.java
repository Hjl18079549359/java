package com.day0407;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int n=sc.nextInt();
            System.out.println(n);
        }catch(InputMismatchException e){
            System.out.println("输入匹配有问题");
        }

    }
}
