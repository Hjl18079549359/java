package com.day02;

public class ZDemo {
    public static void main(String[] args) {
        for (int i = 2; i <201; i++) {
            boolean f=true;
            for (int j = 2; j <= i/2; j++) {
                if(i%j==0){
                    f=false;
                    break;

                }
            }
            if (f){
                System.out.println("质数："+i);
            }
        }
    }
}
