package com.day0329;

public class SonDemo {
    public static void main(String[] args) {
        Son son = new Son(1,"张三","上海");
    }
}
//父类
class Father{
    int id;
    String name;
    Father(){   }
    Father(int id,String name){
        this.id = id;
        this.name = name;
        System.out.println("我是父类有参构造器"+this.id);
    }
    {
        System.out.println("我是父类普通代码块");
    }
    static {
        System.out.println("我是父类静态代码块");
    }
}
//子类
class Son extends Father{
    String addr;
    public Son(){}
    Son(int id,String name,String addr){
        super(id,name);
        this.addr = addr;
        System.out.println("我是子类构造器"+this.id+this.addr);
    }
    {
        System.out.println("我是子类实例代码块");
    }
    static {
        System.out.println("我是子类静态代码块");
    }
}