package com.day03;

import java.util.Arrays;
import java.util.Scanner;

public class Mod4 {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        String[] names=new String[5];
        int[] arr1=new int[5];
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("学生成绩管理平台：");
            System.out.println("1：录入,2：显示列表，3：查询，4：删除，5，修改，6：退出");
            System.out.println("请输入序号：");
            int cmd=sc.nextInt();
            if (cmd==1){//录入
                System.out.println("输入学生姓名和成绩");
                for (int i = 0; i < names.length; i++) {
                    System.out.println("输入学生姓名：");
                    names[i]=sc.next();
                    System.out.println("输入学生成绩：");
                    arr1[i]=sc.nextInt();
                }
            }else if(cmd==2){
                for (int i = 0; i <names.length; i++) {
                    System.out.println(names[i]+"成绩为："+arr1[i]);
                }
//                System.out.println(Arrays.toString(names));
//                System.out.println(Arrays.toString(arr1));
            }else if (cmd==3){
                System.out.println("输入查询的姓名：");
                String sn=sc.next();
                int index=-1;
                for (int i = 0; i <names.length; i++) {
                    if(sn.equals(names[i])){
                        index=i;
                        break;
                    }
                }if(index!=-1){
                    System.out.println(names[index]+"成绩为："+arr1[index]);
                }else {
                    System.out.println("查无此人");
                }
            }else if(cmd==4){
                System.out.println("输入要修改的姓名：");
                String sn=sc.next();
                int index=-1;
                for (int i = 0; i <names.length; i++) {
                    if(sn.equals(names[i])){
                        index=i;
                        break;
                    }
                }if(index!=-1){
                    System.out.println(names[index]+"学生成绩修改为：");
                    arr1[index]= sc.nextInt();
                    System.out.println(names[index]+"成绩修改后为："+arr1[index]);
                }else {
                    System.out.println("查无此人");
                }
            } else if (cmd==5) {
                System.out.println("输入要删除的姓名：");
                String sn=sc.next();
                int index=-1;
                for (int i = 0; i <names.length; i++) {
                    if(sn.equals(names[i])){
                        index=i;
                        break;
                    }
                }if(index!=-1){
//                    names[index]="";
//                    arr1[index]=0;
                    for (int i = index; i <names.length-1 ; i++) {
                        names[i]=names[i+1];
                        arr1[i]=arr1[i+1];
                    }
                    names=Arrays.copyOf(names,names.length-1);
                    arr1=Arrays.copyOf(arr1,arr1.length-1);
                }else {
                    System.out.println("查无此人");
                }
            }
            if (cmd==6){
                System.out.println("退出学生管理系统");
                break;
            }
        }
    }
}
