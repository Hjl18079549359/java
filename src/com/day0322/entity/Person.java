package com.day0322.entity;

public class Person {
    public Long id;
    public String name;
    public int age;

    public Person() {
    }
    public Person(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}