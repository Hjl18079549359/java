package com.day02;

public class ReDemo {
    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {
                if (j==3){
                    return;
                }
                System.out.println("j="+j);
            }
        }
    }
}
