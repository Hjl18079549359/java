package com.day0414;

public class E2 {
    public static void main(String[] args) {
        E2 e=new E2();
        int r=e.ta(" ");
        System.out.println(r);
    }
    public int ta(String s){
//        charAt(0)通过位置找到字符串的元素
        try{
            System.out.println("try");
            int x=s.charAt(0)-'A';//unicode码相差
            if(x<0||x>10){
                throw new Exception("相差十个字母以上");
            }
            System.out.println("ok");
            return x;
        }catch (NullPointerException e){
            System.out.println("null");
            return 1;
        }catch (RuntimeException e){
            System.out.println("runtime");
            return 2;
        }catch (Exception e){
            System.out.println("execption"+e.getMessage());
            return 3;
        }finally {
            System.out.println("finally");
            return 4;
        }
    }
}
