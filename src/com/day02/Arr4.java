package com.day02;

import java.util.Arrays;

public class Arr4 {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3};
        int[] arr2=new int[]{9,8,6};
        int[] arr3=new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length-1,arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}
