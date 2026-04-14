package com.day03;

public class LoDemo {
    public static void main(String[] args) {
        int sum1=add(1,2);
        int sum2=add(1,2,3);
        float sum3=add(1.5f,5.2f);
        System.out.println(sum1+"\t"+sum2+"\t"+sum3);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static float add(float a,float b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }

}
