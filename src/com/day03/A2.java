package com.day03;

import java.util.Arrays;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String  s=sc.next();
//        char x=s.charAt(0);
//        System.out.println(x);
        String s="aabbccddeeff";
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char target=s1.charAt(0);
        int[] arr1=new int[0];
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (target==ch){
                arr1= Arrays.copyOf(arr1,arr1.length+1);
                arr1[arr1.length-1]=i;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
