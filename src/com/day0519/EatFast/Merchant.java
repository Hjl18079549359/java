package com.day0519.EatFast;

import java.util.Iterator;
import java.util.List;

public class Merchant {
    private  String name;//商家名称
    private Info info;//商家信息
    private List<Food> foodList;//商家菜单

    public Merchant() {
    }

    public Merchant(String name, Info info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
//    添加菜品
    public void addFood(Food food){
        boolean contains = this.foodList.contains(food);
        if(!contains){
            this.foodList.add(food);
            System.out.println("菜品 [" + food.getFoodName() + "] 添加成功！");
        }else {
            System.out.println("菜单列表中该菜品 [" + food.getFoodName() + "] 已经上架！");
        }
    }
//    移除菜品
    public void removeFood(String foodName){
        boolean found=false;
        Iterator<Food> iterator = this.foodList.iterator();
        while(iterator.hasNext()){
            Food food = iterator.next();
            if (food.getFoodName().equals(foodName)){
                iterator.remove();
                found=true;
            }
        }
        if(found){
            System.out.println("菜单列表中该菜品已经下架！");
        }else {
            System.out.println("输入有误，商家菜单列表没有该菜品");
        }
    }
//    菜品列表
    public void foodList(){
        for(Food food:foodList){
            System.out.println(food);
        }
    }
    @Override
    public String toString() {
        return "商家名称："+name+"\t商家详情："+info+"\r\n";
    }
}
