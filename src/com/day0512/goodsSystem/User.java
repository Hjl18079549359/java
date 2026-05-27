package com.day0512.goodsSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Cart cart;
    private List<Order> order;

    public User(){
        cart = new Cart();
        order = new ArrayList<>();
    }
    public User(String name){
        this();
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cart=" + cart +
                ", order=" + order +
                '}';
    }
    public void pay(){
//        生成订单
        order.add(new Order(cart));
        cart.goodsList=new ArrayList<Goods>();
        cart.count=new ArrayList<>();
    }
//    添加商品到购物车
    public void addGoods(Goods goods,Integer count){
        this.cart.add(goods,count);
    }
//    删除商品
    public void deleteGoods(String name){
        this.cart.remove(name);
    }
//    查看订单
    public void showOrder(){
        if (order.isEmpty()){
            System.out.println("暂无订单");
        }
        for(Order o:order){
            System.out.println(o);
        }
    }

}
