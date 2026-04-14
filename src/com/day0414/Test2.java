package com.day0414;

public class Test2 {
    public static void main(String[] args) {
        Product p1=new Product(101,"联想电脑",900);

        Product p2=new Product(101,"联想电脑",900);
        System.out.println("p1地址："+p1);
        System.out.println("p2地址："+p2);
        System.out.println("p1和p2是同一个物品："+p1.equals(p2));
    }
}
class Product{
    int id;
    String title;
    int stock;

    public Product(int id,String title,int stock){
        this.id = id;
        this.title = title;
        this.stock = stock;
    }
    public boolean equals(Object obj){
        if (obj==null){
            return false;
        }
        if (obj==this){
            return true;
        }
        if (obj instanceof Product) {
            Product p = (Product) obj;
            return p.id==this.id&&this.title.equals(p.title)&&this.stock==p.stock;
        }
        return false;
    }
}