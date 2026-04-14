package com.day0329;

public class In2Demo {
    public static void main(String[] args) {
        Fc fc = new Fc();
        fc.fca();
    }
}
//看成父类1，并要有具体的方法
interface MyIn{
    void test1();
    default void inv1(){
        System.out.println("inv1 父类方法");
    }
    static void st1(){
        System.out.println("in1 st1 ");
    }
}
interface MyIn2{
    void test2();
    default void inv2(){
        System.out.println("In2 inv2");
    }
}
class Fc implements MyIn,MyIn2{
    @Override
    public void test1() {
        System.out.println("Fc test1");
    }
    @Override
    public void test2() {
        System.out.println("Fc test2");
    }
    public void fca(){
        MyIn.super.inv1();
        MyIn.st1();
        MyIn2.super.inv2();
    }
//    @Override
//    public void inv1() {
//        System.out.println("Fc inv1");
//    }
//    @Override
//    public void inv2() {
//        System.out.println("Fc inv2");
//    }
}