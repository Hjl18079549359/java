package day04;

import java.util.Arrays;

public class SortQu {
    public static void main(String[] args) {
        int[] arr=new int[]{5,9,1,7,6,4,8,3,2};
        Arrays.sort(arr);
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
//    数组，起始下标，结束下标
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
