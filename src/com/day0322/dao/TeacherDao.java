package com.day0322.dao;

import com.day0322.entity.Teacher;

public class TeacherDao extends PersonDao {
//    先准备10位老师的信息
     Teacher[] teachers=new Teacher[10];
//    添加老师
     public void add(Teacher t){
         for(int i=0;i<teachers.length;i++){
             if(teachers[i]==null ){
                 teachers[i]=t;
                 System.out.println("添加成功");
                 break;
             }
         }
     }
//     查询老师
     public void show(){
         for(int i=0;i<teachers.length;i++){
             if(teachers[i]!=null){
                 System.out.println(teachers[i].id+"\t"+teachers[i].name+"\t"+teachers[i].age+"\t"+teachers[i].addr);
             }
         }
     }
//     判断id的唯一性
     public boolean isExist(Long id){
         for(int i=0;i<teachers.length;i++){
             if(teachers[i]!=null&&teachers[i].id.equals(id)){
                 return true;
             }
         }
         return false;
     }
//     删除老师
     public void delete(Long id){
         for(int i=0;i<teachers.length;i++){
             if(teachers[i]!=null&&teachers[i].id.equals(id)){
                 teachers[i]=null;
                 System.out.println("删除成功");
                 break;
             }
         }
     }
     public void update(Long id,Teacher t){
         for(int i=0;i<teachers.length;i++){
             if(teachers[i]!=null&&teachers[i].id.equals(id)){
                 teachers[i]=t;
                 break;
             }
         }
     }
}
