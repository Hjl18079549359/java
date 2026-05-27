package com.day0526;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> map2=new HashMap<>();
        map2.put("张三",18);
        map2.get("张三");
        Map<String,Integer> map=new HashMap<>();
//        存元素put(k,v)
        map.put("张三",18);
        Map<String,Integer> map1=new HashMap<>();
//        存另一个map对象
        map1.putAll(map);
//        取元素get(k)
        System.out.println(map1.get("张三"));
//        判断是否包含key值containsKey（）/valve值containsValue（）
        System.out.println(map1.containsKey("张三"));
        System.out.println(map1.containsValue(18));
//        移除remove(Object key),根据key值移除
//        map1.remove("张三");
//        System.out.println(map1.get("张三"));
//        移除remove(Object key，Object value),key和value都匹配成功则移除
        map1.remove("张三",18);
        System.out.println(map1.get("张三"));
//        替换replace(K key,V value),根据key值替换value值，覆盖
        map1.replace("张三",19);
//        替换replace(K key,V oldValue,V newValue),必须原来存在该key值，且value值匹配成功，才替换
        map1.replace("张三",18,19);
        System.out.println(map1.get("张三"));

//        获取元素数量size()
        System.out.println(map1.size());
//        判断是否为空isEmpty()
        System.out.println(map1.isEmpty());
//        如果存在则获取值否则返回默认值getOrDefault(key,defaultValue)
        System.out.println(map1.getOrDefault("张三",0));
//        如果不存在key值则添加putIfAbsent(key,value)
        map1.putIfAbsent("张三",18);

//        循环遍历
//        1、通过keySet遍历
        Set<String> keySet = map1.keySet();
//        Collection<Integer> values = map1.values();
//        通过迭代器循环
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value = map1.get(key);
            System.out.println(key+"--"+value);
        }
//        2、通过entrySet遍历
//        获取entry节点对象，Entry<K,V>封装key和value对象
        Set entry = map1.entrySet();
        Iterator iterator1 = entry.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> e = (Map.Entry) iterator1.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+"--"+value);
        }



        Set<Map.Entry<String, Integer>> entrySet = map1.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator0 = entrySet.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> entry1 = iterator0.next();
            String key = entry1.getKey();
            Integer value = entry1.getValue();
            System.out.println(key+"--"+value);
        }
    }
}
