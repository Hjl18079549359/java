package com.day0512.goodsSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodSystem {
    public static void main(String[] args) {
        User user = new User();
        Cart cart = new Cart();
        List<Goods> goodsList = init();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1、查看所有商品2、查询商品3、购物车4、查看订单5、退出");
            String str1 = sc.next();
            if(str1.equals("1")){
                showGoods(goodsList);
            }else if(str1.equals("2")){
                selectGoods(goodsList);
            }else if(str1.equals("3")){
                cart(goodsList,user);
            }else if(str1.equals("4")){
                user.showOrder();
            } else {
                System.exit(0);
            }
        }
    }

    public static List<Goods> init(){
        List<Goods> goods = new ArrayList<>();
        goods.add(new Goods("小米手机", "电子产品", 2999.0));
        goods.add(new Goods("华为笔记本", "电子产品", 5999.0));
        goods.add(new Goods("机械键盘", "电子产品", 399.0));
        goods.add(new Goods("运动鞋", "服装", 499.0));
        goods.add(new Goods("T恤", "服装", 99.0));
        goods.add(new Goods("牛仔裤", "服装", 259.0));
        goods.add(new Goods("牛奶", "食品", 68.0));
        goods.add(new Goods("面包", "食品", 15.0));
        goods.add(new Goods("巧克力", "食品", 45.0));
        goods.add(new Goods("可乐", "食品", 3.5));
        goods.add(new Goods("Java编程思想", "书籍", 99.0));
        goods.add(new Goods("算法导论", "书籍", 128.0));
        goods.add(new Goods("足球", "运动用品", 189.0));
        goods.add(new Goods("篮球", "运动用品", 219.0));
        goods.add(new Goods("钢笔", "文具", 35.0));
        goods.add(new Goods("笔记本（文具）", "文具", 12.0));
        goods.add(new Goods("台灯", "家居用品", 129.0));
        goods.add(new Goods("书包", "箱包", 249.0));
        goods.add(new Goods("耳机", "电子产品", 399.0));
        goods.add(new Goods("鼠标", "电子产品", 89.0));
        return goods;
    }
//    查看使用商品
    public static void showGoods(List<Goods> goods){
        for(Goods g:goods){
            System.out.println(g);
        }
    }
//    查询商品
    public static void selectGoods(List<Goods> goods){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1、按名字2、按类型、3、退出");
            String str1 = sc.next();
            if(str1.equals("1")){
                System.out.println("请输入商品名：");
                String goodsName = sc.next();
                showGoodsByName(goods,goodsName,"NULL");
            }else if(str1.equals("2")){
                System.out.println("请输入类型名：");
                String typeName = sc.next();
                showGoodsByName(goods,"null",typeName);
            }else {
                return;
            }
        }
    }
//条件查询商品
    public static void showGoodsByName(List<Goods> goods,String goodsName,String typeName){
        int i=0;
        if(goodsName!=null){
            for(Goods g:goods){
                if(g.getName().contains(goodsName)){
                    i++;
                    System.out.println(g);
                }
            }
        }
        if(typeName!=null){
            for(Goods g:goods){
                if(g.getType().contains(typeName)){
                    i++;
                    System.out.println(g);
                }
            }
        }
        if(i==0){
            System.out.println("没有相关商品信息！");
        }

    }

//购物车
    public  static void cart(List<Goods> goodsList,User user){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1、添加商品到购物车，2、删除商品3、查看购物车4、结算5、退出");
            String str1 = sc.next();
            if(str1.equals("1")){
                System.out.println("请输入商品名：");
                String goodsName = sc.next();
                Goods g=selectGoodsByName(goodsList,goodsName);
                if(g==null){
                    System.out.println("没有这个商品！");
                    continue;
                }
                System.out.println("请输入商品数量：");
                Integer total = sc.nextInt();
                user.addGoods(g,total);
            }else if(str1.equals("2")){
                System.out.println("请输入商品名：");
                String goodsName = sc.next();
                user.deleteGoods(goodsName);
            }else if(str1.equals("3")){
                user.getCart().showCart();
            }else if(str1.equals("4")){
                user.pay();
            }else {
                return;
            }
        }
    }

    public static Goods selectGoodsByName(List<Goods> goodsList,String goodsName){
        for(Goods g:goodsList){
            if(g.getName().equals(goodsName)){
                return g;
            }
        }
        return null;
    }
//查看订单

}
