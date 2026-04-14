package com.day01;

public class E4 {
    public static void main(String[] args) {
        int a=0;//公
        int b=0;//母

        for (a= 1; a < 20; a++) {
            for (b = 1; b <33 ; b++) {
                int c=100-a-b;
                if (a*5+b*4+c/3==100&&c%3==0){
                    System.out.println("公："+a+"母："+b+"小："+c);
                }
            }
        }
    }
}
