package com.day03;

import java.util.Arrays;

public class A3 {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,1,1,2,3,4,5};
        for (int i = 0; i <arr1.length; i++) {
            boolean b=true;
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i]==arr1[j]){
                    b=false;
                    break;
                }
            }if(b){
                System.out.println(arr1[i]);
            }
        }
    }
}
