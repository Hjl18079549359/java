package com.day0519.EatFast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSystem {
    static Consumer consumer = new Consumer("张三");
    static List<Merchant> merchants = new ArrayList<>();
    public static void main(String[] args) {
//        初始化数据
        initData();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1、商家端2、用户端3、退出系统");
            int type=sc.nextInt();
            if(type==1){
                System.out.println("欢迎商家使用");
                merchant();
            }else if(type==2){
                System.out.println("欢迎用户使用");
                consumer();
            } else if (type == 3) {
                System.out.println("感谢使用，再见！");
                break;
            } else {
                System.out.println("输入有误，重新输入！");

            }
        }
    }
//    商家端
public static void  merchant(){
    Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("请选择商家：");
        for (int i = 0; i < merchants.size(); i++) {
            System.out.println((i + 1) + "、" + merchants.get(i).getName());
        }
        System.out.println("0、返回主菜单");
        int idx = sc.nextInt() - 1;
        if (idx == -1) {
            return; // 返回主菜单
        }
        if (idx < 0 || idx >= merchants.size()) {
            System.out.println("输入有误，请重新选择");
            continue;
        }
        Merchant merchant = merchants.get(idx);

        while(true){
            System.out.println("1、添加菜品  2、移除菜品  3、菜品列表  4、返回上层");
            System.out.println("请选择功能操作：");
            int type=sc.nextInt();
            if(type==1){
                System.out.println("请输入菜品名称：");
                String foodName=sc.next();
                System.out.println("请输入菜品价格：");
                double price=sc.nextDouble();
                System.out.println("请选择类别：FOOD_TYPE1：小炒，FOOD_TYPE2：火锅，FOOD_TYPE3：烧烤，FOOD_TYPE4：甜品，FOOD_TYPE5：水果");
                FoodType foodType= FoodType.valueOf(sc.next());
                Food food=new Food(foodName,price,foodType);
                merchant.addFood(food);
            }else if(type==2){
                System.out.println("请输入要移除的菜品名称：");
                String foodName=sc.next();
                merchant.removeFood(foodName);
            }else if (type==3){
                merchant.foodList();
            }else if(type==4){
                break;
            }else  {
                System.exit(0);
            }
        }
    }
}

    //    消费者
    public static void  consumer(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1、查看商家  2、查询菜品  3、添加菜品到购物车  4、移除购物车菜品  5、结算订单  6、查看订单  0、返回上层");
            System.out.println("请选择功能操作：");
            int type=sc.nextInt();
            if(type==1){
                consumer.showMerchant();
            }else if(type==2){
                System.out.println("输入查询菜品名称：");
                String name=sc.next();
                consumer.queryFood( name);
            }else if(type==3){
                System.out.println("请选择商家：");
                for (int i = 0; i < merchants.size(); i++) {
                    System.out.println((i + 1) + "、" + merchants.get(i).getName());
                }
                int mIdx = sc.nextInt() - 1;
                if (mIdx < 0 || mIdx >= merchants.size()) {
                    System.out.println("输入有误");
                    continue;
                }
                Merchant m = merchants.get(mIdx);
                m.foodList();
                System.out.println("输入菜品名称：");
                String name = sc.next();
                Food selected = null;
                for (Food f : m.getFoodList()) {
                    if (f.getFoodName().equals(name)) {
                        selected = f;
                        break;
                    }
                }
                if (selected != null) {
                    consumer.addFood(selected);
                    System.out.println("已添加到购物车");
                } else {
                    System.out.println("该商家没有此菜品");
                }
            }else if(type==4){
                System.out.println("输入要移除的菜品名称：");
                String name=sc.next();
                consumer.deleteFood(name);
            }else if(type==5){
                consumer.pay();
                System.out.println("结算成功！");
            }else if (type==6){
                consumer.showOrder();
            }else if(type==0){
                break;
            }else  {
                System.exit(0);
            }
        }
    }

    public static   void initData() {
        Merchant m1 = new Merchant("川味小馆", Info.INFO_TYPE1);
        m1.setFoodList(new ArrayList<>());
        m1.addFood(new Food("麻婆豆腐", 18.0, FoodType.FOOD_TYPE1));
        m1.addFood(new Food("水煮鱼", 58.0, FoodType.FOOD_TYPE1));
        m1.addFood(new Food("麻辣火锅", 128.0, FoodType.FOOD_TYPE2));

        Merchant m2 = new Merchant("烧烤达人", Info.INFO_TYPE2);
        m2.setFoodList(new ArrayList<>());
        m2.addFood(new Food("烤羊肉串", 5.0, FoodType.FOOD_TYPE3));
        m2.addFood(new Food("烤鸡翅", 8.0, FoodType.FOOD_TYPE3));
        m2.addFood(new Food("烤茄子", 12.0, FoodType.FOOD_TYPE3));

        Merchant m3 = new Merchant("甜蜜时光", Info.INFO_TYPE3);
        m3.setFoodList(new ArrayList<>());
        m3.addFood(new Food("提拉米苏", 28.0, FoodType.FOOD_TYPE4));
        m3.addFood(new Food("芒果布丁", 15.0, FoodType.FOOD_TYPE4));
        m3.addFood(new Food("草莓蛋糕", 32.0, FoodType.FOOD_TYPE4));
        m3.addFood(new Food("西瓜汁", 10.0, FoodType.FOOD_TYPE5));

        merchants.add(m1);
        merchants.add(m2);
        merchants.add(m3);

        consumer.setMerchantList(merchants);
    }
}
