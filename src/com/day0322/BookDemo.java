package com.day0322;

public class BookDemo {
    public static void main(String[] args) {
        Book b=new Book("java",88);
        System.out.println(b);//堆中地址
        System.out.println(b.hashCode());//hash值 物理计算
        System.out.println(b.toString());//堆中地址

    }
}
//所有的class 都是继承Object
class Book{
    String name;
    int price;;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "name:"+name+"price:"+price;
    }
}