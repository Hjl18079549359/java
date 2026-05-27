package com.day0512.goodsSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {


    public static String getTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
