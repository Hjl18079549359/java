package com.day0322.controller;

import com.day0322.dao.TeacherDao;
import com.day0322.entity.Teacher;

import java.util.Scanner;

public class TeacherController {
    TeacherDao teacherDao=new TeacherDao();
    Scanner sc=new Scanner(System.in);

//    public static void main(String[] args) {
//        TeacherController teacherController = new TeacherController();
//        teacherController.start();
//    }
    public void start(){
        System.out.println("欢迎来到教师管理系统！！！");
        w:
        while ( true) {
            System.out.println("1.添加老师 2.查询老师 3.删除老师 4.修改老师 5.显示老师 6.退出");
            int i = sc.nextInt();
            switch (i) {
                case 1: add();break;
                case 2: query();break;
                case 3: delete();break;
                case 4: update();break;
//            case 5:show();break;
                case 6:
                    System.out.println("欢迎下次光临！！！");
                    break w;
                default:
                    System.out.println("输入错误！！！");
            }
        }
    }
//    添加老师
    public void add(){
        System.out.println("输入老师信息");
        Long id = sc.nextLong();
        boolean exist = teacherDao.isExist(id);
        if (exist) {
            System.out.println("id已存在");
            return;
        }
        String name = sc.next();

        int age = sc.nextInt();
        String addr = sc.next();
        Teacher t=new Teacher(id,name,age,addr);
        teacherDao.add(t);
    }
//    查询老师
    public void query(){
        teacherDao.show();
    }
//    删除老师
    public void delete(){
        System.out.println("输入要删除的id");
        Long id = sc.nextLong();
        boolean exist = teacherDao.isExist(id);
        if (!exist) {
            System.out.println("id不存在");
            return;
        }
        teacherDao.delete(id);
    }
//    修改老师信息
    public void update(){
        System.out.println("输入要修改的id");
        Long id = sc.nextLong();
        boolean exist = teacherDao.isExist(id);
        if (!exist) {
            System.out.println("id不存在,没有相应信息");
            return;
        }
        System.out.println("输入老师信息");
        String name = sc.next();
        int age = sc.nextInt();
        String addr = sc.next();
        Teacher t=new Teacher(id,name,age,addr);
        teacherDao.update(id,t);
        System.out.println("修改成功");
    }

}
