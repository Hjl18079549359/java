package com.day0329;

public class InDemo {
    public static void main(String[] args) {
        IAnimal iAnimal = new DogAnimal();//
        iAnimal.move();
        iAnimal.growl();
        System.out.println(DogAnimal.name);
        IAnimal iAnimal1 = new CatAnimal();
        iAnimal1.move();
        iAnimal1.growl();
//        多态实现时，调用方法 要看清左边的类型
        IPro iPro = new DogAnimal();
        iPro.getPri();
    }
}
//接口
interface IAnimal{
//    常量，一般放一些配置信息或不变的信息
    public static final String name = "Dog";
    void move();
    void growl();
}
//当子类实现接口时，实现接口中的所有的抽象方法
class DogAnimal implements IAnimal,IPro {
    @Override
    public void move() {
        System.out.println(name);
        System.out.println(IAnimal.name);
        System.out.println("Dog move");
    }
    @Override
    public void growl() {
        System.out.println("Dog 3年");
    }

    @Override
    public void getPri() {
        System.out.println("价格：1000");
    }
}
class CatAnimal implements IAnimal{
    @Override
    public void move() {
        System.out.println("Cat move");
    }
    @Override
    public void growl() {
        System.out.println("Cat 2年");
    }

}
interface IPro{
    void getPri();
}