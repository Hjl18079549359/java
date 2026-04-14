package com.day01;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        /*
        * 商厂消费打折
        * 大于1000，六折
        * */
        Scanner scanner=new Scanner(System.in);
        int p= scanner.nextInt();
//        if(p>500){
//            if(p>800){
//                if(p>1000){
//                    System.out.println(p*0.6);
//                }
//                System.out.println(p*0.8);
//            }
//            System.out.println(p*0.9);
//        }else{
//            System.out.println(p);
//        }
        if(p>1000){
            System.out.println(p*0.6);
        } else if (p>800) {
            System.out.println(p*0.7);
        }
    }
}
