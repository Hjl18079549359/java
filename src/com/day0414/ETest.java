package com.day0414;

import java.util.Scanner;

public class ETest {
    public static void main(String[] args) {
        try {
            Card c=new Card("20232033304","gongshang",1000);
            Scanner sc=new Scanner(System.in);
            System.out.print("输入取款余额：");
            int num=sc.nextInt();
            c.getMoney(num);
        }catch (Exe e){
            System.out.println(e.getMessage());
        }
    }
}
class Card{
    String idCard;
    String bankName;
    int money;
    public Card(String idCard, String bankName, int money) {
        this.idCard = idCard;
        this.bankName = bankName;
        this.money = money;
    }
    public void getMoney(int num) {
        if(num>money){
            throw new Exe("余额不足","huang");
        }else {
            System.out.println("取款成功");
        }
    }
}
class Exe extends RuntimeException {
    String msg;
    String author;
    public Exe(){}
    public Exe(String msg, String author) {
        this.msg = msg;
        this.author = author;
    }
    //    Exception 默认有个方法getMessage()重写
    public String getMessage() {
        return "异常信息:"+this.msg+"\n操作者是："+this.author;
    }
}