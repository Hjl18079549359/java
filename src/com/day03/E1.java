package com.day03;

public class E1 {
    public static void main(String[] args) {
        int a=10;
        ch(a);
        System.out.println("1--"+a);
    }
    public static void ch(int a){
        System.out.println("2--"+a);
        a=20;
        System.out.println("3--"+a);
    }
}
