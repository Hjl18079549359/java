package com.day0407;

public class LaDemo {
    public static void main(String[] args) {
//        1、用具体的子类
        Thread1 thread1=new Thread1();
        Thread t1=new Thread(thread1);
        t1.start();
//        2、匿名内部类
        new Thread(){
            @Override
            public void run() {
                System.out.println("run方法2");
            }
        }.start();
//        3、lamdba表达式，接口只有一个
        new Thread(
                ()->{
                    System.out.println("run方法3");
                }
        ).start();
    }
}
//实现一个接口
class Thread1 implements Runnable{
    public void run(){
        System.out.println("线程中的run方法");
    }
}
