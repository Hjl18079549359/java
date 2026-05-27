package com.day0428.pracetice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DouDiZhu {
    public static void main(String[] args) {
//        花样
        List<String> colors=List.of("♥️","♦️","♠️","♣️");
//        牌
        List<String> cards= List.of("A","2","3","4","5","6","7","8","9","10","J","Q","K");
//        王牌
        List<String> kings=List.of("大王","小王");
//      混合
        List<String> sum=new ArrayList<>();
        sum.addAll(kings);
        for(String color:colors){
            for(String card:cards){
                sum.add(color+card);
            }
        }
//        洗牌
        Collections.shuffle(sum);
//        玩家1
        List<String> user1=new ArrayList<>();
//        玩家2
        List<String> user2=new ArrayList<>();
//        玩家3
        List<String> user3=new ArrayList<>();
//        底牌
        List<String> dipai=new ArrayList<>();
//        发牌
        for (int i = 0; i < 17; i++) {
            user1.add(sum.remove(0));
            user2.add(sum.remove(0));
            user3.add(sum.remove(0));
        }
//        底牌
        dipai.addAll(sum);
        System.out.println("底牌:"+dipai);
        System.out.println("玩家1的牌:"+user1);
        System.out.println("玩家2的牌:"+user2);
        System.out.println("玩家3的牌:"+user3);
    }
}
