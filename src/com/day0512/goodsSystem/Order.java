package com.day0512.goodsSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Goods> goodsList;
    private List<Integer> count;
    private double price;
    private String date;

    public Order(Cart cart) {
        this.goodsList=cart.getGoodsList();
        this.count=cart.getCount();
        double price=0;
        for(int i=0;i<this.goodsList.size();i++){
            price+=this.goodsList.get(i).getPrice()*this.count.get(i);
        }
        this.price=price;
        this.date=Utils.getTime();
    }


    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public List<Integer> getCount() {
        return count;
    }

    public void setCount(List<Integer> count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    // toString
    @Override
    public String toString() {
        String s = "***订单信息***\r\n";
        s+="商品名\t商品类型\t商品价格\t商品数量\r\n";
        for (int i = 0; i < goodsList.size(); i++) {
            s+= goodsList.get(i).getName()+"\t\t"
                    +goodsList.get(i).getType()+"\t\t"
                    +goodsList.get(i).getPrice()+"\t\t"
                    +count.get(i)+"\r\n";
        }
        s+="订单总价:\t"+price+"\r\n";
        s+="订单时间:\t"+date+"\r\n";
        s+= "***************";
        return s;
    }
}
