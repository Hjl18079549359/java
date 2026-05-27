package com.day0519.EatFast;

public enum Info {
    INFO_TYPE1("正宗川菜，麻辣鲜香"),
    INFO_TYPE2("炭火烧烤，风味独特"),
    INFO_TYPE3("精致甜品，幸福滋味");
    private String desc;

    Info() {
    }
    Info(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
