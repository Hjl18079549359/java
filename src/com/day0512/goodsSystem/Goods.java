package com.day0512.goodsSystem;

import java.util.Objects;

public class Goods {
    private String name;
    private String type;
    private double price;

    public Goods() {
    }

    public Goods(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(name, goods.name) && Objects.equals(type, goods.type);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }


    @Override
    public String toString() {
        return "商品名："+name+"\t商品类型："+type+"\t商品价格："+price+"\r\n";
    }
}
