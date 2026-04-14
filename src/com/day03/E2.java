package com.day03;

public class E2 {
    public static void main(String[] args) {
        int[] arr=new int[]{10,11,21};
        ch(arr);
        System.out.println("1--"+arr[0]);
    }
    public static void ch(int[] a){
        System.out.println("2--"+a[0]);
        a[0]=21;
        System.out.println("3--"+a[0]);
    }
}
