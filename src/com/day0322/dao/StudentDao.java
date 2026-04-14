package com.day0322.dao;

import com.day0322.entity.Student;

import java.util.Scanner;

public class StudentDao extends PersonDao {
    Scanner sc=new Scanner(System.in);
    Student[] students=new Student[10];
//    添加同学
    public void add(Student s){
        for(int i=0;i<students.length;i++){
            if(students[i]==null){
                students[i]=s;
                System.out.println("添加成功");
                break;
            }
        }
    }
//    id学号唯一性
    public boolean isExist(Long id) {
        for(int i=0;i<students.length;i++){
            if(students[i]!=null&&students[i].id.equals( id)){
                return true;
            }
        }
        return false;
    }
// 查询同学
    public Student query() {
        System.out.println("输入要查询的id");
        Long id = sc.nextLong();
        boolean exist = isExist(id);
        if (!exist) {
            System.out.println("id不存在");
            return null;
        }
        for(int i=0;i<students.length;i++){
            if(students[i]!=null&&students[i].id.equals(id)){
                System.out.println("学号："+students[i].id+"\t姓名："+students[i].name+"\t年龄："+students[i].age+"\t成绩："+students[i].grade);
            }
        }
        return null;
    }
//删除学生
    public void delete(Long id) {
        for(int i=0;i<students.length;i++){
            if(students[i]!=null&&students[i].id.equals(id)){
                students[i]=null;
                System.out.println("删除成功");
                break;
            }
        }
    }
//    修改学生信息
    public void update(Long id, Student s) {
        for(int i=0;i<students.length;i++){
            if(students[i]!=null&&students[i].id.equals(id)){
                students[i]=s;
                break;
            }
        }
        System.out.println("修改成功");
    }
//显示学生信息列表
    public void show() {
        for(int i=0;i<students.length;i++){
            if(students[i]!=null){
                System.out.println("学号："+students[i].id+"\t姓名："+students[i].name+"\t年龄："+students[i].age+"\t成绩："+students[i].grade);
            }
        }
    }
}
