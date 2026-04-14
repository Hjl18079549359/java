package com.day0414;

public class E3 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("算术异常");
        }finally {
            System.out.println("finally");
        }
    }
}
