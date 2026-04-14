package com.day03;

public class Lo2 {
    public static void main(String[] args) {
//        String[] arr=new String[]{"A","B","C"};
//        for (String a:arr){
//            System.out.println(a);
//        }
        int sum=add(1,2,3,4,5);
        System.out.println(sum);
        int[] arr=new int[]{5,6,7};
        int sum2=add(arr);
        System.out.println(sum2);
    }
    public static  int add(int ... a){
        int sum=0;
        for (int x:a){
            sum=sum+x;
        }
        return sum;
    }
}
