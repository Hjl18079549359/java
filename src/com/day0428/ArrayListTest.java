package com.day0428;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
//        ArrayList的使用
        List<String> list = new LinkedList<>();
//        add()添加元素进列表的末尾
        list.add("aa");
        list.add("1234");
        list.add("黄");
        list.add("huang");
//        size()返回列表元素的数量
        System.out.println("当前元素数量："+list.size());
//        get(int index)获取指定下标元素
        System.out.println("第二个元素："+list.get(1));
//        add(int index,E e)插入元素
        list.add(1,"wang");
//        set(int index,E e)修改元素
        list.set(0,"hhhhhhh");
//        remove(对象)/(下标)删除元素
//        list.remove("hhhhhh");
        list.remove(1);
//        contains(对象)判断是否包含某个对象
        System.out.println(list.contains("haung"));
//        indexOf()返回对象第一次出现的位置,lastindexOf()反过来
        System.out.println(list.indexOf("haung"));
//        循环遍历集合
////        fori
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
////        for each增强for循环，没有下标，直接获取对象
////        for(数据类型 对象名: 循环的大对象){}
//        for (String str : list) {
//            System.out.println(str);
//        }
//        迭代器循环
//        1、获取迭代器对象
        Iterator<String> iterator = list.iterator();
//        迭代器对象的三个常用方法
//        判断是否有下一个对象
        while (iterator.hasNext()) {
//            获取下一个对象
            String next = iterator.next();
//            if(next.equals("aa")){
//                iterator.remove();//删除当前元素
//            }
            System.out.println(next);
        }

    }
}
