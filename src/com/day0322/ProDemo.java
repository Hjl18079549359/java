package com.day0322;

public class ProDemo {
    public static void main(String[] args) {
        Pro pro = new Pro();
        pro.setName("张三");
        System.out.println(pro.getName());
    }
}
class Pro{
    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    int pri;
    String name;
    String type;

}
