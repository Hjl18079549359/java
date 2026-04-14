package com.day0329;

public class Ab1 {
    public static void main(String[] args) {

    }
}
abstract class An{
    int a;
    String name;
    public An(){}

    public An(int a, String name) {
        this.a = a;
        this.name = name;
    }
    public void show(){
        System.out.println("实例方法");
    }
    public abstract void show1();//抽象方法
}
