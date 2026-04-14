package com.day0322;

public class M1Demo {
    public static void main(String[] args) {
        Bo bo = new Bo();
        System.out.println(bo.id);
        bo.t2();
    }

}
class Bo{
    int id;//成员变量
    String name;
    public void show(){
        System.out.println(id);
        int t=1;//局部变量
        if (t>1) {
            System.out.println("id:" + id + " name:" + name);
        }
    }
    public void t2(){
        System.out.println("t2");
    }
}