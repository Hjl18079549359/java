package com.day0329.controller;
import com.day0329.entity.Teacher;
import com.day0329.dao.PersonDao;
import com.day0329.entity.Person;
import com.day0329.entity.Student;
import java.util.Scanner;
public class PersonController {
    PersonDao personDao=new PersonDao();
    Scanner sc=new Scanner(System.in);
    public void start(int type){
        w:
        while ( true) {
            System.out.println("1.添加 2.查询 3.删除 4.修改 5.显示 6.退出");
            int i = sc.nextInt();
            switch (i) {
                case 1: add(type);break;
                case 2: query(type);break;
                case 3: delete(type);break;
                case 4: update(type);break;
                case 5: show(type);break;
                case 6: System.out.println("欢迎下次光临！！！");
                    break w;
                default:
                    System.out.println("输入错误！！！");
            }
        }
    }
    //    添加学生
    public void add(int type){
        System.out.println("输入信息");
        Long id = sc.nextLong();
        if (personDao.isExist(id,type)){
            System.out.println("id已存在,添加错误");
        }
        String name = sc.next();
        int age = sc.nextInt();
        Person p=null;
        if (type==2){
            int grade = sc.nextInt();
            p=new Student(id,name,age,grade);
        }
        if (type==1){
            String addr = sc.next();
            p=new Teacher(id,name,age,addr);
        }
        personDao.add(p,type);
    }
    //    查询 学生
    public Person query(int type){
        return personDao.query(type);
    }
    //    删除学生
    public void delete(int type){
        System.out.println("输入要删除的id");
        Long id = sc.nextLong();
        personDao.delete(id,type);
    }
    //    修改学生信息
    public void update(int type){
        System.out.println("输入要修改的id");
        Long id = sc.nextLong();
        boolean exist = personDao.isExist(id,type);
        if (!exist) {
            System.out.println("id不存在,没有相应信息");
            return;
        }
        System.out.println("输入信息");
        String name = sc.next();
        int age = sc.nextInt();
        Person p=null;
        if (type==2){
            int grade = sc.nextInt();
            p=new Student(id,name,age,grade);
        }
        if (type==1){
            String addr = sc.next();
            p=new Teacher(id,name,age,addr);
        }
        personDao.update(id,p,type);
    }
    //    展示所有学生信息
    public void show(int type){
        personDao.show(type);
    }
}
