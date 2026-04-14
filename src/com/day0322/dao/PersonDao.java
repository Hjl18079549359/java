package com.day0322.dao;

import com.day0322.entity.Student;

public class PersonDao {
    public void add(Student s){
        System.out.println("添加成功");
    }
    public void delete(Long id) {
        System.out.println("删除成功");
    }
    public void show() {
        System.out.println("显示成功");
    }
}
