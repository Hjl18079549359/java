package com.day0519.EatFast;

public enum FoodType {
    FOOD_TYPE1("小炒"),
    FOOD_TYPE2("火锅"),
    FOOD_TYPE3("烧烤"),
    FOOD_TYPE4("甜品"),
    FOOD_TYPE5("水果");
    private String name;


    FoodType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
