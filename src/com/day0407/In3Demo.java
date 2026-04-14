package com.day0407;

public class In3Demo {
    public static void main(String[] args) {
        Person person=new Person("黄谨来",28,100);
        person.pay(1000);
    }
}
class Person{
    String name;
    int age;
    int proPri;//商品价格
    public Person(String name,int age,int proPri){
        this.name = name;
        this.age = age;
        this.proPri = proPri;
    }
    public void pay(int te){//需要支付的钱
        class Card{
            String cNo;
            String cType;
            boolean isAct;
            public Card(String cNo,String cType){
                this.cNo = cNo;
                this.cType = cType;
                this.isAct = true;
            }
            public void con(){
                System.out.println(this.cNo+" "+this.cType+" "+this.isAct);
                if (isAct){
                    if (proPri<=te){
                        System.out.println("扣了"+proPri);
                    }else {
                        System.out.println("余额不足");
                    }
                }
            }
        }
        Card c=new Card("10012003","工商银行卡");
        c.con();//方法内调用
    }
}