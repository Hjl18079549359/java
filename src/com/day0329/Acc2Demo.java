package com.day0329;

public class Acc2Demo {
    public static void main(String[] args) {
        SUser sUser = new SUser("1",1000);
        sUser.deposit(100);
        sUser.credit(1000);
        System.out.println(sUser.getBalance());
    }
}
interface Account{
     boolean deposit(double amount);//存钱
    boolean credit(double amount);//扣钱
    double getBalance();//获取余额
}
class SUser implements Account{
    String accNumber;
    double balance;
    public  boolean isAct;
    public SUser(){}
    public SUser(String accNumber,double balance){
        this.accNumber = accNumber;
        this.balance = balance;
        this.isAct = true;
    }
    @Override
    public boolean deposit(double amount) {
        if (isAct){
            this.balance += amount;
            System.out.println("存钱成功，余额为："+this.balance);
            return true;
        }
        return false;
    }

    @Override
    public boolean credit(double amount) {
        if (isAct && this.balance >= amount){
            this.balance -= amount;
            System.out.println("取钱成功，余额为："+this.balance);
            return true;
        }
        return false;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}