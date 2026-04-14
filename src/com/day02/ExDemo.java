package com.day02;

public class ExDemo {
    public static void main(String[] args) {
        try{
            for (int i = 0; i <5; i++) {
                for (int j = 0; j <5; j++) {
                    if (j==3){
                        throw  new Exception();
                    }
                    System.out.println("j="+j);
                }
            }
        }catch (Exception e){

        }

    }
}
