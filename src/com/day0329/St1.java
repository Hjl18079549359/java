package com.day0329;

public class St1 {
    public static void main(String[] args) {
        Stu s=new Stu();
    }
}
class Stu{
    int i=1;
    static int a=1;
    public Stu(){
        System.out.println("默认构造器=");
    }
    {//实例代码块，创建对象时候调用
        a=13;
        i=2;
        System.out.println("实例i="+i);
        System.out.println("实例a="+a);
    }
    static {//静态代码块，创建对象之前调用（加载时已有），静态不能调用实例变量
//        i=4;
        a=3;
        System.out.println("静态a="+a);
    }
}