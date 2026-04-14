package com.day0407;
//内部类解决单继承
public class In5 {
    public static void main(String[] args) {
        Mi a=new Mi();
        Mi.M1 b=a.new M1();
        b.dos();
        Mi.M2 c=a.new M2();
        c.gos();
    }
}
//医生
class Dor{
    String name;
    String sub;
    public Dor(){}
    Dor(String name,String sub){
        this.name=name;
        this.sub=sub;
    }
    public void dos(){
        System.out.println("医生");
    }
}
//女人
class Woman{
    String name;
    int age;
    public Woman(){}
    Woman(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void gos(){
        System.out.println("逛街");
    }
}
class Mi{
    class M1 extends Dor{
    }
    class M2 extends Woman{
    }
}
