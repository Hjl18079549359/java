package com.day0519;
//    枚举类：为了解决常量问题
//    枚举类不可以new对象，在设计的时候就写好所有对象
public enum GoodsType {

//枚举的过程就是new对象的过程
    DRINK("饮料","夏天必备");


    private String name;

    private String desc;

    GoodsType() {
    }

    GoodsType(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
