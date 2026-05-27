package com.day0519.EatFast;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
    private String name;
    private Cart cart;
    private List<Order> order;
    private List<Merchant> merchantList;
    public Consumer(){
        cart = new Cart();
        order = new ArrayList<>();
        merchantList = new ArrayList<>();
    }
    public Consumer(String name){
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

    public List<Merchant> getMerchantList() {
        return merchantList;
    }

    public void setMerchantList(List<Merchant> merchantList) {
        this.merchantList = merchantList;
    }

//    结算订单
    public void pay(){
//        生成订单
        order.add(new Order(cart));
        cart.foodList=new ArrayList<Food>();

    }
//    添加菜品到购物车
    public void addFood(Food food){
        this.cart.add(food);
    }
//    删除菜品
    public void deleteFood(String name){
        this.cart.remove(name);
    }
//    查看购物车
    public void showOrder(){
        if(order.size()==0){
            System.out.println("暂无订单");
        }
        for(Order o:order){
            System.out.println(o);
        }
    }
//    查看商家
    public void showMerchant(){
        if(merchantList.size()==0){
            System.out.println("暂无商家");
        }
        for(Merchant m:merchantList){
            System.out.println(m);
        }
    }
//    查询菜品
    public void queryFood(String name){
        Boolean flag = false;
        for(Merchant m:merchantList){
            for(Food f:m.getFoodList()){
                if(f.getFoodName().equals(name)){
                    flag = true;
                    System.out.println(f);
                }
            }
        }
        if(!flag){
            System.out.println("没有该菜品");
        }
    }
}
