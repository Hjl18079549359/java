package com.day0526;

import java.util.Objects;

public class Goods  implements Comparable{
    private String name;
    private int price;

    public Goods() {
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return price == goods.price && Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Object o) {
//        返回值为0则认为相等（equals相等），大于0排列在后，小于0排在前面
//        按照价格从小到大排序
        if (o instanceof Goods){
            Goods goods = (Goods) o;
            if (this.equals( goods))
                return 0;
            int i = this.getPrice()-goods.getPrice();
            if(i==0){
                return -1;
            }
            return i;
        }
        return 0;
    }
}
