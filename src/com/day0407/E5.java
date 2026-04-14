package com.day0407;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//格式异常
public class E5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入日期");
        String str=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date date =sdf.parse(str);//先把字符串内容转换为日期类型内容
            date.setMonth(date.getMonth()+5);//在当前日期上加5
            System.out.println(sdf.format(date));
        }catch (ParseException e){
            System.out.println("请按提示格式输入");
        }finally {
            System.out.println("程序最终成功运行");
        }
    }
}
