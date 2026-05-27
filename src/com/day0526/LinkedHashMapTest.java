package com.day0526;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
//      true 表示按照访问顺序排序,false 表示按照插入顺序排序
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>(10,0.75f,true);
        map.put("张三",18);
        map.put("张",19);
        System.out.println( map.get("张三"));

    }
}
