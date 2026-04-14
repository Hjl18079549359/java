package com.day0322;

public class St2 {
    public static void main(String[] args) {
        System.out.println(StK.b);
        StK.getB();
        System.out.println("--------static----");
        StK k=new StK();
        System.out.println( k.a);
        System.out.println(StK.b);//静态的可以通过类名调用
        k.getA();
        System.out.println("--------static----");
        StK k1=new StK();
        System.out.println( k1.a);
        System.out.println(StK.b);
        k1.getA();
    }
}
class StK{
    int a=1;
    static int b=2;
    static int c=3;
    public StK(){
        a++;
        b++;
    }
    public void getA(){
        getB();
        System.out.println("getA");
    }
    public static void getB(){
        System.out.println("getB");
    }
}