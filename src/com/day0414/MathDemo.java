package com.day0414;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-12));//绝对值
        System.out.println(Math.ceil(12.1f));//向上取整
        System.out.println(Math.floor(12.1f));//向下取整
//        项目方：收钱要多收，出钱要少出
        System.out.println(Math.random());//0..1随机小数
//        取二位小数
        double a=3.1415926d;
        System.out.println(Math.floor(a*100)/100);
        //        取二位小数
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(a));//按四舍五入

        Random random=new Random();//随机数
        System.out.println(random.nextInt(100));//含左不含右

        System.out.println(Math.pow(2,5));//次方
        System.out.println(Math.pow(64,1/2.0));//开方
        System.out.println(Math.sqrt(81));//开方

        int a1=12;
        int b=25;
        int c=69;
        System.out.println(Math.max(Math.max(a1,b),c));//最大
        System.out.println(Math.min(Math.min(a1,b),c));//最小
    }
}
