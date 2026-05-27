package com.day0526;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
//        TreeMap可以按照一定的规则去排序
//        1、自然排序
//        存储的元素必须实现Comparable接口
        TreeMap<Goods,Integer> treeMap=new TreeMap<>();
        treeMap.put(new Goods("张三",8),30);
        treeMap.put(new Goods("张",20),10);
        treeMap.put(new Goods("三",18),3);
        for(Map.Entry<Goods,Integer> entry:treeMap.entrySet()){
            System.out.println(entry.getKey().getName()+"--"+entry.getKey().getPrice());
        }
//      2、定制排序
        TreeMap<Goods,Integer> treeMap1=new TreeMap<>(new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
    }
}
