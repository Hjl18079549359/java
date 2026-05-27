package com.day0519.EatFast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
    public List<Food> foodList;

    public Cart() {
        foodList = new ArrayList<>();
    }

    public Cart(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
    public String toString(){
        String s = "====购物车信息====";
        s+="菜品名\t菜品类型\t菜品价格\r\n";
        for(Food food:foodList){
            s+=food.toString();
        }
        s+="*********************************";
        return s;
    }

//    添加菜品到购物车
    public void add(Food food){
        int index=foodList.indexOf(food);
        if(index<0) {
            foodList.add(food);
        }
    }
//    移除购物车菜品
    public void remove(String name){
        Iterator<Food> iterator = foodList.iterator();
        while(iterator.hasNext()){
            Food food = iterator.next();
            if (food.getFoodName().equals(name)) {
                foodList.remove(food);
            }
        }
        System.out.println("购物车没有该菜品");
    }
}
