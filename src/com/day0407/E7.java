package com.day0407;

public class E7 {
    public static void main(String[] args) {
        System.out.println(get());
    }
    public static int get(){
        try {
            System.out.println("a");
            return 1;
        }catch (Exception e){
            System.out.println("b");
        }finally {
            System.out.println("c");
        }
        return 4;
    }
}
