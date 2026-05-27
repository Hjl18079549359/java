package com.day0519.EatFast;

import java.util.List;

public class Order {
    private List<Food> cartList;
    private String date;
    private double price;

    public Order() {
    }

    public Order(Cart cart) {
        this.cartList = cart.getFoodList();
        this.date = Util.getTime();
        double price=0;
        for (Food food : cartList) {
            price+=food.getPrice();
        }
        this.price = price;
    }

    public List<Food> getCartList() {
        return cartList;
    }

    public void setCartList(List<Food> cartList) {
        this.cartList = cartList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        String s="====订单信息====\t\n";
        s+="菜品名\t菜品类型\t菜品价格\t\n";
        for (int i = 0; i < cartList.size(); i++) {
            s+=cartList.get(i).toString()+"\t";
        }
        s+="订单总价：\t"+price+"\t\n";
        s+="订单时间：\t"+date+"\t\n";
        s+="************************************";
        return s;
    }
}
