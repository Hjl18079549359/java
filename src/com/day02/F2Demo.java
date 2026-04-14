package com.day02;

public class F2Demo {
    public static void main(String[] args) {
        Boolean a=true;
        for (int i = 0; i <5 && a; i++) {
            for (int j = 0; j <5 && a; j++) {
                if (j==3){
                    a=false;
                }
                System.out.println("j="+j);
            }
        }
    }
}
