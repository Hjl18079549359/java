package com.day0407;

public class E2 {
    public static void main(String[] args) {
        pop();
    }
    public static void pop() throws NegativeArraySizeException{
        int[] arr = new int[-4];
        System.out.println("数组下标负数");
    }
}
