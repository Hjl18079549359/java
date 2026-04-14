package com.day0322.entity;

public class Student extends  Person{
    public  int grade;
    public Student(){}

    public Student(Long id, String name, int age, int grade) {
        super(id, name, age);
        this.grade = grade;
    }
}
