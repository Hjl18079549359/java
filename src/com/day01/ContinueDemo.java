package com.day01;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("**********");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j==3){
                    break;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
