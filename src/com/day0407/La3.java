package com.day0407;

public class La3 {
    public static void main(String[] args) {
        Re1 l1=La3::num1;//静态写法
        System.out.println(l1.num1(4));


        La3 l3=new La3();//动态写法
        Re2 l2=l3::num2;
        System.out.println(l2.num2(4));
    }
    public static int num1(int a){
        return a;
    }
    public int num2(int a){
        return a;
    }
}

interface Re1{
    int num1(int a);
}
interface Re2{
    int num2(int a);
}
