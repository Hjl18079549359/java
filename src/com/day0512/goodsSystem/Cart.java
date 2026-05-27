package com.day0512.goodsSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
    public List<Goods> goodsList;
    public List<Integer> count;

    public Cart() {
//        初始化
        goodsList = new ArrayList<>();
        count = new ArrayList<>();
    }

    public Cart(List<Goods> goodsList, List<Integer> count) {
        this.goodsList = goodsList;
        this.count = count;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public List<Integer> getCount() {
        return count;
    }

    public void setCount(List<Integer> count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String s="***购物车信息***\r\n";
        s+="商品名\t商品类型\t商品价格\r\n";
        for (int i = 0; i <goodsList.size() ; i++) {
            s+=goodsList.get(i).getName()+"\t"
                    +goodsList.get(i).getType()+"\t"+goodsList.get(i).getPrice()+"\t"
                    +count.get(i)+"\r\n";
        }
        s+="*********************************************";
        return s;
    }

    //    添加购物车
    public void add(Goods goods,Integer total){
////        判断商品是否存在于购物车
//        for (int i = 0; i < goodsList.size(); i++) {
//            Goods g = goodsList.get(i);
//            //      如果存在则找到商品下标，让对应的数量进行修改
//            if (g.equals(goods)){
//                count.set(i, count.get(i)+total);
//            }else  {
//                //        如果不存在则正常添加商品和数量
//                goodsList.add(goods);
//                count.add(total);
//            }
//        }

        int index=goodsList.indexOf(goods);
        //        判断商品是否存在于购物车
        if (index>=0){
            //      如果存在则找到商品下标，让对应的数量进行修改
            count.set(index,count.get(index)+total);
        }else {
            //        如果不存在则正常添加商品和数量
            goodsList.add(goods);
            count.add(total);
        }
    }
//    移除购物车商品（迭代器）
    public void remove(String name){
        Iterator<Goods> iterator = goodsList.iterator();
        while (iterator.hasNext()){
            Goods temp=iterator.next();
            if (temp.getName().equals(name)){
                iterator.remove();
            }
        }
        System.out.println("购物车没有此商品！");
    }
//    查看购物车
    public void showCart(){
        if (goodsList.size()==0){
            System.out.println("购物车暂时为空！");
        }
        for (Goods goods:goodsList){
            System.out.println(goods);
        }
    }
//    打印购物车信息 toString()方法是在执行sout打印方法时调用的

//    public void removeGoods(Goods goods,Integer total){
//        int index=goodsList.indexOf(goods);
//        if (index>=0){
//            if(count.get(index)>total) {
//                count.set(index, count.get(index) - total);
//                if (count.get(index) == total) {
//                    goodsList.remove(index);
//                    count.remove(index);
//                } else {
//                    throw new IllegalArgumentException();
//                }
//            }
//        }
//    }
}
