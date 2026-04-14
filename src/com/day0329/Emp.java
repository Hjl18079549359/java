package com.day0329;
public class Emp {
    public static void main(String[] args) {
        Employee emp = new Employee("小王",5);
        emp.addLeaveDays(1);
        emp.reducesLeaveDays(3);
        System.out.println("员工最终请假天数："+emp.getLeaveDays()+"天");
    }
}
interface Leave{
    void addLeaveDays(int num);//增加天数
    void reducesLeaveDays(int num);
    int getLeaveDays();
}
class Employee implements Leave{
    String name;
    int leavesDays;
    Boolean isComplete;
    Boolean isLeaderAct;
    public  Employee(){}

    public  Employee(String name, int leavesDays) {
        this.name = name;
        this.leavesDays = leavesDays;
        this.isComplete = true;
        this.isLeaderAct = true;
    }
    public void addLeaveDays(int num) {
        if (isComplete){
            this.leavesDays += num;
            System.out.println("员工"+name+"请假成功，请假天数为："+this.leavesDays);
        }
    }
    public void reducesLeaveDays(int num) {
        if (isLeaderAct){
            this.leavesDays -= num;
            System.out.println("员工"+name+"请假由于领导不允许，请假天数减"+num+"天");
        }
    }
    public int getLeaveDays() {
        return this.leavesDays;
    }
}