package com.day0329;

public class CurDemo {
    public static void main(String[] args) {
//        调用时两个类都要准备好
        Cur cur = new Cur("java", 4);
        CL cl = new CL("信工楼", 101);
        cl.pr(cur);
    }
}
//教室 类
class CL{
    String name;
    int num;
    public CL() {
    }
    public CL(String name, int num) {
        this.name = name;
        this.num = num;
    }
//    教思会调用课程的信息，主教楼，101,计算机，第四节课
    public void pr(Cur  cur){
        System.out.println(this.name+" "+this.num+" "+cur.name+" "+cur.id);
    }
}
//课程类
class Cur{
    String name;
    int id;//第几节
    Cur() {
    }
    public Cur(String name, int id) {
        this.name = name;
        this.id = id;
    }
}