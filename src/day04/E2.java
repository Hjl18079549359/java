package day04;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=num(sc.nextInt());
        System.out.println(count);
    }
    public static int num(int x){
        if(x==1||x==2){
            return x;
        } else if (x==3) {
            return 4;
        } else  {
            return num(x-1)+num(x-2)+num(x-3);
        }
    }
}
//1-1
//2-2
//3-4
//4-7
//5-13