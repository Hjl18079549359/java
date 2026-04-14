package com.day0322;

import com.day0322.sub.Koa;

//权限
public class AccDemo {
    public static void main(String[] args) {
//        同包
        Foo f=new Foo();
        System.out.println(f.a);
        System.out.println(f.b);
//        System.out.println(f.c);//用不了，夸类使用不了
        System.out.println(f.getC());//这个可以用
        System.out.println(f.d);

//不同包
        Koa k=new Koa();
        System.out.println(k.a);
//        System.out.println(k.b);//不同包，用不了
//        System.out.println(k.c);
//        System.out.println(k.d);
        System.out.println(k.getC());

        Kob kob=new Kob();
        kob.start();
    }
}
class Foo{
    public int a=1;
    protected int b=2;
    private int c=3;
    int d=4;
    public int getC(){
        return c;
    }
}
//继承
class Kob extends Koa{
    public void start(){
        System.out.println(a);
        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
        System.out.println(getC());
    }
}