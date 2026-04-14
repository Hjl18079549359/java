package com.day02;
import java.util.Arrays;
import java.util.Random;

public class Housework {
//    作业1：
//    public static void main(String[] args) {
//        int[] arr=new int[0];//数组1
//        int[] arr2=new int[0];//数组2
//
//        Random random=new Random();
//        for (int i = 1; i <9; i++) {
//            arr=Arrays.copyOf(arr,arr.length+1);
//            arr[arr.length-1]=i;
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < 9; i++) {
//            int x= random.nextInt(20);
//            arr2=Arrays.copyOf(arr2,arr2.length+1);
//            arr2[arr2.length-1]=x;
//        }
//        System.out.println(Arrays.toString(arr2));
//        int[] arr3=new int[arr.length+arr2.length];//数组3
//        System.arraycopy(arr,0,arr3,0,arr.length);
//        System.arraycopy(arr2,0,arr3,arr.length,arr2.length);
//        System.out.println(Arrays.toString(arr3));
//    }
//    作业2：
      public static void main(String[] args) {
          int[] arr=new int[]{2,5,11,4,7,15};
          for (int i = 0; i <arr.length; i++) {
              for (int j = i+1; j <arr.length; j++) {
                  if(arr[i]+arr[j]==9){
                      System.out.println("下标索引为："+i+"\t"+j);
                  }
              }
          }
     }
}
