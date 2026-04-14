package day04;

public class E1 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,1,2,2,2,2};
        half(arr);
    }
    public  static void half(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int count=1;
            for (int j = 0; j < arr.length ; j++) {
                if (i==j){
                    continue;
                } else if (arr[i]==arr[j]) {
                    count++;
                }
            }
            if (count> arr.length/2){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
