package com.day01;

public class LogicDemo2 {
    public static void main(String[] args) {
//        男性，或18岁以上
        char ch='男';
        int age=19;
        if(ch=='男'|age++>=18){
            System.out.println("欢迎你");
        }else{
            System.out.println("不规范");
        }
        System.out.println(age);
//        ||第一个语句成功了，第二个不用执行
//        |都会执行
        boolean rain=true;
        if(!rain){
            System.out.println("没下雨");
        }else{
            System.out.println("下雨");
        }
    }
}
