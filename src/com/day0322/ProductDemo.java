package com.day0322;

public class ProductDemo {
    public static void main(String[] args) {
        Product p=new Product("生活超市",9.9);
        p.show();
        System.out.println("------------------父类");
        Shoe s=new Shoe("回力",888,"新百润");
        s.show();
        System.out.println("------------------子类");
        Computer c=new Computer("联想",9999,"Intel");
        c.show();
        System.out.println("------------------子类");
    }

}
class Product{
    String name;
    double price;
    public Product(){

    }
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void show(){
        System.out.println("超市降价，大甩卖");
        System.out.println(name+"\t价格是\t"+price);
    }
}
class Shoe extends Product{
    String brand;
    public Shoe(){

    }
    public Shoe(String name,double price,String brand){
        super(name,price);
        this.brand=brand;
    }
    public void show(){
        System.out.println("新品牌靴子上市");
        System.out.println(name+"\t价格是\t"+price+"\t品牌是"+brand);
    }
}
class Computer extends Product{
    String cpu;
    public Computer(){

    }
    public Computer(String name,double price,String cpu){
        super(name,price);
        this.cpu=cpu;
    }
    public void show(){
        System.out.println("新电脑上市");
        System.out.println(name+"\t价格是\t"+price+"\tcpu是"+cpu);
    }
}