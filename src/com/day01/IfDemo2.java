package com.day01;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        String str=i%2==0?"偶数":"奇数";
        System.out.println(str);
    }
}
