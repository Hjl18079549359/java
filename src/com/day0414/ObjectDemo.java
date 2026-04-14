package com.day0414;

import java.util.Random;

public class ObjectDemo {
    public static void main(String[] args) {
        Person person=new Person("12","123");
        System.out.println(person);//地址值toString()方法
        System.out.println(person.hashCode());
        Person person1=new Person("12","123");
        System.out.println(person1.hashCode());
        System.out.println(person1.getClass());//对应class文件的类名

        System.out.println(person.equals(person1));//默认情况下，比的是地址

    }
}
//默认都是继承Object
class Person extends Object{
    String name;
    String password;
    public Person(){}
    public Person(String name,String password){
        this.name=name;
        this.password=password;
    }
//    如果没有重写这个toString()方法，绘默认调用基类Object的toString()方法
    public String toString() {//显示用，真实情况person,person1地址值不同
        return "name="+name+",password="+password;
    }

    public boolean equals(Object obj){//person,person1都是Object
        if (obj==null){
            return false;
        }
        if (obj==this){// == 比地址
            return true;
        }
        if(obj instanceof Person){//instanceof类型判断
            Person person1=(Person)obj;//强制类型转换Object-->Person
            return this.name.equals(person1.name) && this.password.equals(person1.password);
        }
        return false;
    }


    public int hashCode(){
        Random random=new Random();
        return name.hashCode()+random.nextInt(10000);
    }

}