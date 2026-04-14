package com.day0322;

public class HosDemo {
    public static void main(String[] args) {
        Patient p1=new Patient();
        p1.say();
        p1.eat();
        Doctor p2=new Doctor(101,"张三",18,"医生");
        System.out.println(p2.title);
        p2.say();
        p2.eat();

    }
}
//父类
class Person{
    String name;
    int age;
    int id;
    public Person(){}
    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void say(){
        System.out.println("我是一个好人");
    }
    public void eat(){
        System.out.println("吃吃吃");
    }

}
//子类
class Doctor extends Person{
    String title;
//    重写父类的方法
    public void eat(){
        System.out.println("医生吃饭");
    }
    public Doctor(){}
    public Doctor(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Doctor(int id,String name,int age,String  title){
//        super(name,age,id);//调用父类 的构造器
        this(id,name);//调用本类 的构造器
        this.title=title;
    }
}
class Patient extends Person{
    String disease;//疾病
    String hosNo;//住院几部
    //    重写父类的方法
    public void eat(){
        System.out.println("病人吃饭");
    }
}