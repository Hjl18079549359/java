package com.day0407;

public class La2Demo {
    public static void main(String[] args) {
//        匿名内部类
        NoReturn n=new NoReturn(){
            public void say(){
                System.out.println("hello");
            }
        };

//        lamdba
        n.say();
        NoReturn n1=(()->{
            System.out.println("hello");
        });
        n1.say();


        reOne r=new reOne() {
            @Override
            public void info(int a) {
                System.out.println(a);
            }
        };
        r.info(8888);
        reOne r1=((a)->{
            System.out.println(a);
        }) ;
        r1.info(9999);

        reTwo r3=new reTwo() {
            public int sum(int a,int b){
                return a+b;
            }
        };
        System.out.println(r3.sum(10, 44));

        reTwo r2=((a,b)->{
           return a+b;

        });
        System.out.println(r2.sum(8, 9));

    }
}
//无参
interface NoReturn{
    void say();
}
//有参
interface reOne{
    void info(int a);
}

interface reTwo{
    int sum(int a,int b);
}