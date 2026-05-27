package com.day0421;

public class Food extends Goods{
    private String brand;

    public Food() {
    }

    public Food(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void introduce() {
        System.out.println("食物有多种品牌。");
    }
}
