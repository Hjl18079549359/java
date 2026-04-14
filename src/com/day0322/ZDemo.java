package com.day0322;
/*
* 方法重载
*
*方法相同，参数类型不同，和返回的值没有关系
* */
public class ZDemo {
    public static void main(String[] args) {
        ZDemo demo = new ZDemo();
        demo.add(1,2);
    }
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
class He{
    He(){
        System.out.println("无参构造方法");
    }
    int He(){
        System.out.println("无参方法");
        return 0;
    }
    /*he(){   不可

    }
    */
}
