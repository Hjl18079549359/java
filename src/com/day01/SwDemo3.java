package com.day01;

import java.util.Scanner;

public class SwDemo3 {
    public static void main(String[] args) {
//        输入月份得到对应的季节
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数字");
        int  num=scanner.nextInt();
        switch (num){
            case 1:
            case 2:
            case 12:
                System.out.println("冬天");break;
            case 3:
            case 4:
                System.out.println("春天");break;

        }
    }
}
