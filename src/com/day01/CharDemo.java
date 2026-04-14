package com.day01;

public class CharDemo {
    public static void main(String[] args) {
        char h1='a';
        System.out.println(h1);
//        已知一个unicode码，直接输出得到字符
        char ch2=30000;
        System.out.println(ch2);
//        已知一个字符，求对应的Unicode码
        char ch1='$';
        System.out.println(ch1-0);//默认是运算是int，会识别成数字

//        字符串，不是基本数据类型，底层是有char组成的
        String str="黄谨来";
        System.out.println(str.charAt(0));
//
        boolean rain=false;
        if(rain){//真
            System.out.println("我们出去玩");
        }else{//假
            System.out.println("待在家里");
        }
    }
}
