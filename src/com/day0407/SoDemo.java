package com.day0407;

public class SoDemo {
    public static void main(String[] args) {
        Sno a=new Sno("香奈儿",999);
        System.out.println(a.ntype+a.pri);
        Sno.Tso.pri();
        System.out.println(Sno.Tso.addr+Sno.Tso.year);
    }
}
class Sno{
    String ntype;
    int pri;
    public Sno(String ntype,int pri){
        this.ntype=ntype;
        this.pri=pri;
    }
//    材料
    static class  Tso{
        static String addr="宜春";
        static int year=2003;
        public Tso(String addr,int year){
            this.addr=addr;
            this.year=year;
        }
        public static void pri(){
            System.out.println("本材料为："+addr+year);
        }
}
}
