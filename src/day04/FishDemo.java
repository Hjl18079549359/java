package day04;
//一个java文件中，可以多个class,只能有和个public class
public class FishDemo {
    public static void main(String[] args) {
        Fish f1=new Fish();//创建一对象
        f1.pri=21;
        f1.color="黄色";
        System.out.println(f1.pri);//0
        System.out.println(f1.color);//NULL
        f1.move();

        Fish f2=new Fish(101,"黑色");//按参数调用
        System.out.println(f2.color);
        System.out.println(f2.pri);
        f2.move();
    }
}
class Fish{
    int pri;//属性
    String color;
    public void move(){
        System.out.println("会游动");
    }
    public Fish(){//默认构造器

    }
    public Fish(int pri,String color){//有参构造器
        this.pri=pri;//this 当前 把等下传入的值给刚刚new出来的对象
        this.color=color;
    }
}
