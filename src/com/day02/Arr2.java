package com.day02;

import java.util.Arrays;

public class Arr2 {
    public static void main(String[] args) {
        int[] arr=new int[]{11,2,5,6};
        arr= Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=88;
        System.out.println(Arrays.toString(arr));
        int[] a=new int[0];
        for (int i =11; i <21; i++) {
            a=Arrays.copyOf(a,a.length+1);
            a[a.length-1]=i;
        }
        System.out.println(Arrays.toString(a));
    }
}
