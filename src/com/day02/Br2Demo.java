package com.day02;

public class Br2Demo {
    public static void main(String[] args) {
        out://设置一个标记,下面一段代码，归标记所记录
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {
                if (j==3){
                    break out;
                }
                System.out.println("j="+j);
            }
        }
    }
}
