package com.day0414;

public class E4 {
    public static void main(String[] args) {
//        int[] arr=new int[]{1,2,3,4,5};
//        getA(arr,-1);
        try{
            int[] arr=new int[]{1,2,3,4,5};
            getA(arr,-1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
//    方法内抛异常throw +new 的对象
//    通过下标找数组元素
    public static void getA(int[] arr,int index){
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("下标异常");
        }else {
            System.out.println(arr[index]);
        }
    }
}
