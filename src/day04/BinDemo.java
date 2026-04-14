package day04;

public class BinDemo {
    public static void main(String[] args) {
        int[] arr=new int[]{8,6,2,7,5,9,4};
//        int x=coBin(arr,6);
        int x=co1Bin(arr,0,arr.length-1,6);
        System.out.println(x);
    }
    public static  int coBin(int[] arr,int val){
        int low=0;
        int hi=arr.length-1;
        int mid=0;
        while (low<=hi){
            mid=(hi+low)/2;
            if(arr[mid]>val){
                hi=mid-1;
            }else if (arr[mid]<val){
                low=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
//    使用递归
    public  static int co1Bin(int[] arr,int begin, int end,int a){
//        if (a>arr[end] || a<arr[begin]){
//            return -1;
//        }
        int mid=0;
        while(begin<=end){
            mid=(begin+end)/2;
            if (arr[mid]>a){
                return co1Bin(arr,begin,mid-1,a);
            } else if (arr[mid]<a) {
                return co1Bin(arr,mid+1,end,a);
            }else {
                return mid;
            }
        }
        return mid;
    }
}
