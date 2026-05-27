package com.day0421;

public class Clothing extends Goods{
    private String type;

    public Clothing() {
    }
    public Clothing(String name, int price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void introduce() {
        System.out.println("衣服有多种类型。");
    }
}
