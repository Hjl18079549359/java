package com.day0329;

import javax.swing.plaf.PanelUI;

public class Ab2 {
    public static void main(String[] args) {
        Dog dog = new Dog(1,"Dog");
        dog.move();
        System.out.println(dog.name);
        Fish fish = new Fish(1,"Fish");
        fish.move();//重写
        System.out.println(fish.name);
        System.out.println("-----------------");
//        多态  把子类对象赋给父类  向上转型
        Animal a = new Dog(3,"Dog1");
        a.move();
        System.out.println(a.name);
        Animal a1= new Fish(1,"Fish1");
        a1.move();
        System.out.println(a1.name);
//        a,a1都是Animal类型，move方法，有着不同的特性，多态，运行时多态

//        3封装性， 安全性极高
        Animal[] animals = new Animal[2];
        animals[0]=a;
        animals[1]=a1;
        for (Animal a0: animals){//按Animal类型，把animals赋给a0
            a0.move();//多态
            System.out.println(a0.name);
        }

    }
}
abstract class Animal{
    int age;
    String name;
    public Animal(){}
    public Animal(int age,String name){
        this.age = age;
        this.name = name;
    }
    public abstract void move();
}
class Dog extends Animal{
    public Dog(){}
    public Dog(int age,String name){
        super(age,name);
    }
    @Override
    public void move() {
        System.out.println("Dog move走动");
    }
}
class Fish extends Animal{
    public Fish(){}
    public Fish(int age,String name){
        super(age,name);
    }
    @Override
    public void move() {
        System.out.println("Fish move游动");
    }
}