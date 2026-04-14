package com.day0329.entity;

public class Teacher extends Person {
    public String addr;
    public Teacher() {
    }
    public Teacher(Long id, String name, int age, String addr) {
        super(id, name, age);
        this.addr = addr;
    }

    @Override
    public String getAddr() {
        return addr;
    }
}
