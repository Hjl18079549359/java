package com.day01;

import java.sql.SQLOutput;

public class JavaA {
    public static void main(String[] args) {
        System.out.println("holle huangjinlai");
        int i=27;
//    转二进制Integer int 包装类
        System.out.println(Integer.toBinaryString(i));
//        转八进制
        System.out.println(Integer.toOctalString(i));
//        转十六进制
        System.out.println(Integer.toHexString(i));
//        各种基本类型
        byte b1=127;
//        Byte是byte的包装类
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        short s1=23333;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        int i1=303030303;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        long l1=232323L;//要以L结尾，
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        byte a=12;
        byte b=13;
        byte c=(byte)(a+b);
        System.out.println(c);
        int c1=a+b;
        System.out.println(c1);

        float f1=32.2f;//以f结尾，如果不以，默认double
        double d1=544d;//以d结尾
        System.out.println(f1);
        System.out.println(d1);

    }



}
