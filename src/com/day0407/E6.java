package com.day0407;
//数组下标越界
public class E6 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        try{
            for (int i=0;i<5;i++){
                arr[i]=i;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
        }finally {
            System.out.println("最终程序成功执行");
        }
    }
}
