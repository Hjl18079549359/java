package day04;

import java.util.Arrays;
import java.util.Random;

public class Sort2 {
    public static void main(String[] args) {
        Random random=new Random();
//        int x=random.nextInt(1000);
        int[] arr=new int[10000];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=random.nextInt(10000);
        }
        long la=System.currentTimeMillis();
//        bull(arr);
//        select(arr);
//        insertSort(arr);
        quick(arr,0,arr.length-1);
        long lb=System.currentTimeMillis();
        System.out.println(lb-la);
    }
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
//        System.out.println(Arrays.toString(arr));
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
//        System.out.println(Arrays.toString(arr));
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
//        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr,int begin,int end){
        if (begin>end){
            return;
        }
        int tmp=arr[begin];
        int i=begin;
        int j=end;
        while(i!=j){
            while(arr[j]>=tmp&&j>i){
                j--;
            }
            while(arr[i]<=tmp && j>i){
                i++;
            }
            if(j>i){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[begin]=arr[i];
        arr[i]=tmp;
        quick(arr,begin,i-1);
        quick(arr,i+1,end);
    }
}
