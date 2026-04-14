package com.day03;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int[] arr=new int[]{8,2,9,1,4,6};
//        Arrays.sort(arr);
        bull(arr);
//        System.out.println(Arrays.toString(arr));
        select(arr);
        insertSort(arr);
    }
//    冒泡
    public static  void bull(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//    选择排序321
    public static void select(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {//控制几轮
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//    插入排序
    public static  void insertSort(int[] arr){
        int j=0;
        for (int i = 1; i <arr.length; i++) {
            int t=arr[i];
            for ( j = i-1; j>=0 ; j--) {
                if (t<arr[j]){
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//    快速排序

}
