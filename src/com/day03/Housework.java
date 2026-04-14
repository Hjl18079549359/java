package com.day03;

import java.util.Arrays;
import java.util.Scanner;

public class Housework {
    public static void main(String[] args) {
        start();
//        int[] arr1=new int[]{1,1,1,2,2,2,2};
//        get(arr1);
    }
    public static void start(){
        String[] names=new String[3];
        String[] authors=new String[3];
        double[] prices=new double[3];
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("图书管理平台：");
            System.out.println("1:添加书籍；2:显示列表；3:查找书籍；4:删除；5:退出");
            System.out.println("请输入功能序号：");
            int cmd=sc.nextInt();
            if(cmd==1){
                for (int i = 0; i < names.length; i++) {
                    System.out.println("请输入书名：");
                    names[i]=sc.next();
                    System.out.println("请输入作者：");
                    authors[i]=sc.next();
                    System.out.println("请输入价格：");
                    prices[i]=sc.nextDouble();
                }
            } else if (cmd==2) {
                for (int i = 0; i <names.length; i++) {
                    System.out.println("书名："+names[i]+"\t作者："+authors[i]+"\t价格："+prices[i]);
                }
            } else if (cmd==3) {
                System.out.println("请输入要查找的书名：");
                String sn=sc.next();
                int index=-1;
                for (int i = 0; i < names.length; i++) {
                    if (sn.equals(names[i])){
                        index=i;
                        break;
                    }
                }
                if(index!=-1){
                    System.out.println("书名："+names[index]+"\t作者："+authors[index]+"\t价格："+prices[index]);
                }else {
                    System.out.println("没有这本书");
                }
            } else if (cmd==4) {
                System.out.println("请输入要删除书名：");
                String sn=sc.next();
                int index=-1;
                for (int i = 0; i < names.length; i++) {
                    if (sn.equals(names[i])){
                        index=i;
                        break;
                    }
                }
                if(index!=-1){
                    for (int i = index; i <names.length ; i++) {
                        names[index]=names[index+1];
                        authors[index]=authors[index+1];
                        prices[index]=prices[index+1];
                    }
                    names= Arrays.copyOf(names,names.length-1);
                    authors=Arrays.copyOf(authors,authors.length-1);
                    prices=Arrays.copyOf(prices,prices.length-1);
                }else {
                    System.out.println("没有这本书");
                }
            } else if (cmd==5) {
                System.out.println("平台管理结束，并退出");
                break;
            }
        }
    }
    public static void get(int[] arr){
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(found){
                break;
            }
            int count=0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>(arr.length/2)){
                System.out.print("出现过半的元素："+arr[i]);
                found=true;
            }
        }
        if (!found){
            System.out.println("数组内没有过半的元素");
        }
    }
}
