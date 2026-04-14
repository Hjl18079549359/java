package com.day0407;

public class ClassADemo {
    public static void main(String[] args) {
        ClassA c1 = new ClassA("1001",21);
        ClassA.Cr C=c1.new Cr("java",2);
        C.pr();
    }
}
class ClassA{
    String name;
    int num;
    public ClassA(){}
    public ClassA(String name,int num){
        this.name=name;
        this.num=num;
    }
    class Cr{
        String cname;
        int sr;
        public Cr(String cname,int sr){
            this.cname=cname;
            this.sr=sr;
        }
        public void pr(){
            System.out.println("教师为"+name+"喊得课程"+cname+"第"+this.sr+"节");
        }
    }
}