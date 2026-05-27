package com.day0421;

import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入功能选项进行查看：1饮料，2食物，3衣服");
        int a = sc.nextInt();
        Goods g = null;
//        switch (a) {
//            case 1:
//                g = new Drink();
//        }
        if (a == 1) {
            g = new Drink();
        }else if (a == 2) {
            g = new Food();
        }else if (a == 3) {
            g = new Clothing();
        }
        g.introduce();
        if(g instanceof Drink){
            ((Drink) g).setCapacity("100ml");
            ((Drink) g).getCapacity();
        }
    }
}
