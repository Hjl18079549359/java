package com.day01;

public class LogicDemo {
    public static void main(String[] args) {
//        让性别是男，年龄大于18岁，欢迎你
        char ch='女';
        int age=19;
        if (ch=='男'&age++>=18){
            System.out.println("欢迎你");
        }else {
            System.out.println("不规范");
        }
        System.out.println(age);
//        && 短路，当第一个不满足，第二个不会执行
//        & 并，全部执行完
    }
}
