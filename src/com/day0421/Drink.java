package com.day0421;

public class Drink extends Goods {
    private String capacity;

    public Drink() {

    }

    public Drink(String name, int price, String capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
        System.out.println(capacity);
    }
    public void introduce(){
        System.out.println("饮料容量有500ml,300ml");
    }
}
