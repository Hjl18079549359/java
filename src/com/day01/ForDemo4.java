package com.day01;

public class ForDemo4 {
    public static void main(String[] args) {
        /*
        *
        * */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; /*j <=i*/ j<i+1; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
