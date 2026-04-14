package com.day0329.controller;

import java.util.Scanner;

public class SystemController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonController personController = new PersonController();
        w:
        while (true) {
            System.out.println("1.老师信息系统 2.学生信息系统");
            System.out.print("请选择：");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    System.out.println("欢迎来到老师管理系统！");
                    personController.start(cmd);
                    break;
                case 2:
                    System.out.println("欢迎来到学生管理系统！");
                    personController.start(cmd);
                    break;
                case 3:
                    System.out.println("欢迎下次使用！！");
                    break w;
                default:
                    System.out.println("输入错误");
            }

        }
    }
}
