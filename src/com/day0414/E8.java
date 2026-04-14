package com.day0414;
import java.util.Scanner;

//用户注册判断，用方法内throw new Exception
public class E8 {
    public static void main(String[] args) {
//        Integer.parseInt()把字符串数字装换成数值的数字
        Scanner sc=new Scanner(System.in);
        UserDao userDao=new UserDao();
        while(true){
            System.out.println("1是注册，2是显示");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("输入用户名，密码");
                String name=sc.next();
                String password=sc.next();
                User user=new User(name,password);

                try{
                    userDao.addUser(user);
                    System.out.println("注册成功");
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }else if(n==2){
                userDao.showUser();
                System.out.println("break");
                break;
            }
        }
    }
}
//用户类
class User{
    String name;
    String password;
    public User(String name,String password){
        this.name=name;
        this.password=password;
    }
}
//dao 操作数据
class UserDao{
    User[] Users=new User[2];
//    注册用户
    public void addUser(User user){
        validateUser(user.name);
        validatePassword(user.password);
        for(int j=0;j<Users.length;j++){
            if (Users[j]==null){
                Users[j]=user;
                break;
            }
        }
    }
//    显示用户
    public void showUser(){
        for(int j=0;j<Users.length;j++){
            if(Users[j]!=null){
                System.out.println(Users[j].name+":"+Users[j].password);
            }
        }
    }
//    添加之前，验证核对
    public void validateUser(String name){
        if (name.length()<6 || name.length()>12){
            throw new IllegalArgumentException("用户名长度不对,长度要6-12位");
        }
    }
    public void validatePassword(String password){
        if(!password.equals(Integer.toString(Integer.parseInt(password)))){
            throw new IllegalArgumentException("密码不是全数字");
        }
    }
}