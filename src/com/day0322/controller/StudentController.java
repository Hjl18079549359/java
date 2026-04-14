package com.day0322.controller;
import com.day0322.dao.StudentDao;
import com.day0322.entity.Student;
import java.util.Scanner;
public class StudentController {
    StudentDao studentDao=new StudentDao();
    Scanner sc=new Scanner(System.in);
    public void start(){
        System.out.println("欢迎来到学生管理系统！！！");
        w:
        while ( true) {
            System.out.println("1.添加学生 2.查询学生 3.删除学生 4.修改学生 5.显示学生 6.退出");
            int i = sc.nextInt();
            switch (i) {
                case 1: add();break;
                case 2: query();break;
                case 3: delete();break;
                case 4: update();break;
                case 5: show();break;
                case 6: System.out.println("欢迎下次光临！！！");
                    SystemController.main(null);
                    break w;
                default:
                    System.out.println("输入错误！！！");
            }
        }
    }
//    添加学生
    public void add(){
        System.out.println("输入学生信息");
        Long id = sc.nextLong();
        if (studentDao.isExist(id)){
            System.out.println("id已存在,添加错误");
        }
        String name = sc.next();
        int age = sc.nextInt();
        int grade = sc.nextInt();
        Student s=new Student(id,name,age,grade);
        studentDao.add(s);
    }
//    查询 学生
    public Student query(){
        return studentDao.query();
    }
//    删除学生
    public void delete(){
        System.out.println("输入要删除的id");
        Long id = sc.nextLong();
        studentDao.delete(id);
    }
//    修改学生信息
    public void update(){
        System.out.println("输入要修改的id");
        Long id = sc.nextLong();
        boolean exist = studentDao.isExist(id);
        if (!exist) {
            System.out.println("id不存在,没有相应信息");
            return;
        }
        System.out.println("输入学生信息");
        String name = sc.next();
        int age = sc.nextInt();
        int grade = sc.nextInt();
        Student s=new Student(id,name,age,grade);
        studentDao.update(id,s);
    }
//    展示所有学生信息
    public void show(){
        studentDao.show();
    }
}
