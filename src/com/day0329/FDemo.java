package com.day0329;

public class FDemo {
}
final class F1{
    int id;
    String name;
}
//final的类不能被继承
//class F2 extends F1{
//
//}
class F3{
//    final int id;
//    不能操作final类型变量
    int age;
    public F3() {
//        this.id++;
        age++;
    }
    public final void show(){
        System.out.println(age);
    }

}
class F4 extends F3{
//    不能被重写
//    public void show() {
//        System.out.println(age);
//    }
}