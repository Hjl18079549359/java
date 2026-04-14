package com.day0407;

public class In4 {
    public static void main(String[] args) {
        /*MyAli myAli=new MyAli();
        myAli.pay();
        myAli.re();*/
//        把接口想象成父类，因为接口和实现类，父与子的关系
        Ali a=new Ali() {//{}内就是对接口的实现，本来是要依赖一个具体类，此时省去了具体类
            @Override
            public void pay(int money) {
                System.out.println("支付"+money);
            }

            @Override
            public void re() {
                System.out.println("取消支付");
            }
        };
        a.pay(100);
        a.re();
    }
}

interface Ali{
    void pay(int money);//支付
    void re();//撤回
}
/*
//先不用匿名内部类，正常类实现
class MyAli implements Ali{
    @Override
    public void pay() {
        System.out.println("支付");
    }

    @Override
    public void re() {
        System.out.println("取消支付");
    }
}*/
