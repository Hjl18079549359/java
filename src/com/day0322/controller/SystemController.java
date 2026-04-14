package com.day0322.controller;

import java.util.Scanner;

public class SystemController {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.老师信息系统 2.学生信息系统");
        System.out.println("请选择：");
        int cmd=sc.nextInt();
        switch (cmd){
            case 1:
                TeacherController teacherController = new TeacherController();
                teacherController.start();
                break;
            case 2:
                StudentController studentController = new StudentController();
                studentController.start();
                break;
            default:
                System.out.println("输入错误");
        }

    }
}
