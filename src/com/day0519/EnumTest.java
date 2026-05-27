package com.day0519;

public class EnumTest {
    public static void main(String[] args) {
//        获取枚举类型
        GoodsType[] TYPES = GoodsType.values();
        for (GoodsType goodsType : TYPES) {
            System.out.println(goodsType);
        }

        GoodsType goodsType = GoodsType.DRINK;

        GoodsType goodsType1 = GoodsType.valueOf("DRINK");
        System.out.println(goodsType.getName());
        System.out.println(goodsType1.getName());
        System.out.println(goodsType1 == goodsType);//true
    }
}
