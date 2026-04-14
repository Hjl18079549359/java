package com.day03;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
        String str="好好学习，天天向上";
//        char x=str.charAt(0);
//        System.out.println(x);
        /*
        * 得到“天”字的下标，并放到新数组内
        * */
        int[] arr1=new int[0];
        for (int i = 0; i < str.length(); i++) {
            char x=str.charAt(i);
            if(x=='天'){
                arr1= Arrays.copyOf(arr1, arr1.length+1);
                arr1[arr1.length-1]=i;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
