package com.day02;

public class Arr5 {
    public static void main(String[] args) {
        int[] index=new int[]{2,0,3,2,4,0,1,2,2,3,3};
        int[] arr=new int[]{8,2,1,0,3};
        for (int i=0;i<index.length;i++){
            System.out.print(arr[index[i]]);
        }
    }
}
