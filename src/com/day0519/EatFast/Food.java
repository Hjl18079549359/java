package com.day0519.EatFast;

import java.util.Objects;

public class Food {

    private String foodName;//菜品名称
    private double price;
    private FoodType foodType;

    public Food() {
    }

    public Food(String foodName, double price, FoodType foodType) {
        this.foodName = foodName;
        this.price = price;
        this.foodType = foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(foodName, food.foodName) && foodType == food.foodType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodName, foodType);
    }

    @Override
    public String toString() {
        return "菜品名称："+foodName+"\t菜品类型："+foodType+"\t菜品价格："+price+"\r\n";
    }
}
