package com.day0414;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        UserDemoDao d=new UserDemoDao();
        while(true){
            System.out.println("1:注册 2:显示");
            int a=sc.nextInt();
            if(a==1){
                System.out.println("输入用户名，密码，手机号");
                String name=sc.next();
                String password=sc.next();
                String phone=sc.next();
                UserDemo user=new UserDemo(name,password,phone);
                try{
                    d.register(user);
                    System.out.println("注册成功");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }else if(a==2){
                d.showUser();
                break ;
            }

        }
    }
}
class UserDemo{
    String name;
    String password;
    String phone;
    public UserDemo(String name,String password,String phone){
        this.name=name;
        this.password=password;
        this.phone=phone;
    }
}
class UserDemoDao{
    UserDemo[] users=new UserDemo[4];
//    用户注册
    public void register(UserDemo user){
        validateUser(user);
        for(int j=0;j<users.length;j++){
            if(users[j]==null){
                users[j]=user;
                break;
            }
        }
    }
//    显示用户
    public void showUser(){
        for(int i=0;i<users.length;i++){
            if(users[i]!=null){
                System.out.println("用户名："+users[i].name+"密码："+users[i].password+"手机号："+users[i].phone);
            }
        }
    }
//    用户名校验
    public void validateUser(UserDemo user){
        if(user==null){
            throw new IllegalArgumentException("用户为空");
        }
        if(user.name.length()<8 ||user.name.length()>12){
            throw new IllegalArgumentException("用户名长度不对,长度要8-12位");
        }
        if (user.password.length()!=6|| !user.password.equals(Integer.toString(Integer.parseInt(user.password)))){
            throw new IllegalArgumentException("密码格式有问题,密码位数不是6位或密码不是全数字");
        }
        if (user.phone.length()!=11 || !user.phone.equals(Long.toString(Long.parseLong(user.phone)))){
            throw new IllegalArgumentException("手机号格式有问题,手机号位数不是11位或手机号不是全数字");
        }
    }
}