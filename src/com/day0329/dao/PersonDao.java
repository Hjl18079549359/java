package com.day0329.dao;
import com.day0329.entity.Person;
import com.day0329.entity.Student;
import com.day0329.entity.Teacher;
import java.util.Scanner;
public class PersonDao {

    Scanner sc=new Scanner(System.in);
    Person[] students=new Student[10];
    Person[] teachers=new Teacher[10];
    // 添加
    public void add(Person s, int type) {
        if (type == 2) { // 学生
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = (Student) s;
                    System.out.println("添加成功");
                    break;
                }
            }
        } else if (type == 1) { // 老师
            for (int i = 0; i < teachers.length; i++) {
                if (teachers[i] == null) {
                    teachers[i] = (Teacher) s;
                    System.out.println("添加成功");
                    break;
                }
            }
        }
    }
    // ID唯一性判断
    public boolean isExist(Long id, int type) {
        if (type == 2) { // 学生
            for(int i=0;i<students.length;i++){
                if(students[i]!=null&&students[i].id.equals( id)){
                    return true;
                }
            }
        } else if (type == 1) { // 老师
            for(int i=0;i<teachers.length;i++){
                if(teachers[i]!=null&&teachers[i].id.equals( id)){
                    return true;
                }
            }
        }
        return false;
    }
    // 查询
    public Person query(int type) {
        System.out.println("输入要查询的id");
        Long id = sc.nextLong();
        if (!isExist(id, type)) {
            System.out.println("id不存在");
            return null;
        }
        if (type == 2) { // 学生
            for(int i=0;i<students.length;i++){
                if(students[i]!=null&&students[i].id.equals(id)){
                    System.out.println("学号："+students[i].id+"\t姓名："+students[i].name+"\t年龄："+students[i].age+"\t成绩："+students[i].getGrade());
//                System.out.println("学号："+person[i].id+"\t姓名："+person[i].name+"\t年龄："+person[i].age+"\t成绩："+person[i].grade);
                }
            }
        } else if (type == 1) { // 老师
            for(int i=0;i<teachers.length;i++){
                if(teachers[i]!=null&&teachers[i].id.equals(id)){
                    System.out.println("工号："+teachers[i].id+"\t姓名："+teachers[i].name+"\t年龄："+teachers[i].age+"\t地址："+teachers[i].getAddr());
                }
            }
        }
        return null;
    }
    // 删除
    public void delete(Long id, int type) {
        if (type == 2) { // 学生
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null && students[i].id.equals(id)) {
                    students[i] = null;
                    System.out.println("删除成功");
                    break;
                }
            }
        } else if (type == 1) { // 老师
            for (int i = 0; i < teachers.length; i++) {
                if (teachers[i] != null && teachers[i].id.equals(id)) {
                    teachers[i] = null;
                    System.out.println("删除成功");
                    break;
                }
            }
        }
    }
    // 修改
    public void update(Long id, Person s, int type) {
        if (type == 2) { // 学生
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null && students[i].id.equals(id)) {
                    students[i] = (Student) s;
                    System.out.println("修改成功");
                    break;
                }
            }
        } else if (type == 1) { // 老师
            for (int i = 0; i < teachers.length; i++) {
                if (teachers[i] != null && teachers[i].id.equals(id)) {
                    teachers[i] = (Teacher) s;
                    System.out.println("修改成功");
                    break;
                }
            }
        }
    }
    // 显示所有
    public void show(int type) {
        if (type == 2) { // 学生
            for(int i=0;i<students.length;i++){
            if(students[i]!=null){
                System.out.println("学号："+students[i].id+"\t姓名："+students[i].name+"\t年龄："+students[i].age+"\t成绩："+students[i].getGrade());
//                System.out.println("学号："+person[i].id+"\t姓名："+person[i].name+"\t年龄："+person[i].age+"\t成绩："+person[i].grade);
            }
          }
        } else if (type == 1) { // 老师
            for(int i=0;i<teachers.length;i++){
                if(teachers[i]!=null){
                    System.out.println("工号："+teachers[i].id+"\t姓名："+teachers[i].name+"\t年龄："+teachers[i].age+"\t地址："+teachers[i].getAddr());
                }
            }
        }
    }

}
