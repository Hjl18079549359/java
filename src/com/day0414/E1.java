package com.day0414;

public class E1 {
    public static void main(String[] args) {
        int r=bar();
        System.out.println(r);

    }
    public static int bar(){
        try{
            return 5;
        }finally {
            System.out.println("fi");
        }
    }
}
