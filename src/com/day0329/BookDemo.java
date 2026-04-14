package com.day0329;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book(1, "java", "james", 100);
        System.out.println(book.id() + " " + book.name() + " " + book.author() + " " + book.price());
    }

}
//class Book{
//    int id;
//    String name;
//    String author;
//    int price;
//    public Book() {}
//    public Book(int id, String name, String author, int price) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.price = price;
//    }
//}
//含属性和构造器
record Book(int id, String name, String author, int price) {
}