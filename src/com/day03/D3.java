package com.day03;

public class D3 {
    public static void main(String[] args) {
        int x=sum(12);
        System.out.println(x);
    }
    public static int sum(int a){
       if (a==1 || a==2){
           return 1;
       }else {
           return sum(a-1)+sum(a-2);//前两者之和
       }
    }
}
