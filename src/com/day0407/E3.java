package com.day0407;

public class E3 {
    public static void main(String[] args) throws ClassNotFoundException {
        conn();
        System.out.println("开始操作");
    }
    public static void conn()throws  ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
}
