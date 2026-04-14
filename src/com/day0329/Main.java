package com.day0329;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Winxin(1,"微信");
        System.out.println("-----------------");
        Order order1 = new Zhifubao(2,"支付宝");
        System.out.println("-----------------");
        Order order2 = new Yinghong(3,"银联");
        Scanner scanner=new Scanner(System.in);
        w:
        while (true){
            System.out.println("请输入一个数字");
            int a=scanner.nextInt();
            switch (a){
                case 1:
                    order.pay();
                    break;
                case 2:
                    order1.pay();
                    break;
                case 3:
                    order2.pay();
                    break;
                case 4:
                    System.out.println("退出");
                    break w;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }

//        Order[] orders = new Order[3];
//        orders[0]=order;
//        orders[1]=order1;
//        orders[2]=order2;
//        for (Order o: orders){
//            o.pay();
//            System.out.println(o.name);
//        }
    }
}
abstract class Order{
    int id;
    String name;
    public Order(){
    }
    public Order(int id,String name){
        this.id = id;
        this.name = name;
    }
    public abstract void pay();
}
class Winxin extends Order{
    public Winxin(){
    }
    public Winxin(int id,String name){
        super(id,name);
    }
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
class Zhifubao extends Order{
    public Zhifubao(){
    }
    public Zhifubao(int id,String name){
        super(id,name);
    }
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
class Yinghong extends Order{
    public Yinghong(){
    }
    public Yinghong(int id,String name){
        super(id,name);
    }
    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}
