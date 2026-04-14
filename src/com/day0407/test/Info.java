package com.day0407.test;

public class Info {
    public static void main(String[] args) {
        Student student=new Student(1001,"haung",88);
        Student.Subject s=student.new Subject();
        s.info();
    }

}
class Student{
    int id;
    String name;
    int grade;
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
     class Subject{
        String English="英语";
        String Math="数学";
        String technology;

        public  void info(){
            System.out.println(English+"成绩"+grade+Math+"成绩"+grade);
        }
    }
}