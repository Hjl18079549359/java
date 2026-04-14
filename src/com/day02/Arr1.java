package com.day02;

import java.util.Arrays;

public class Arr1 {
    public static void main(String[] args) {
//        数组声明
        int[] ary;
        ary=new int[4];
        ary[0]=11;
        for (int i = 0; i <ary.length; i++) {
            System.out.println(ary[i]);
        }
        System.out.println(Arrays.toString(ary));
//        2
        int[] ary2=new int[]{2,25,56};
        System.out.println(Arrays.toString(ary2));
//        1,2是动态数组
//        3,静态数组
        int[] ary3={3,4,5,6};
        System.out.println(Arrays.toString(ary3));

    }
}
