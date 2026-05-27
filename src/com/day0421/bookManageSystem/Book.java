package com.day0421.bookManageSystem;

public class Book {
    private  String bookName;
    private  String bookAuthor;
    private String type;
    private Boolean  isBorrow;

    public Book() {
    }
    public Book(String bookName, String bookAuthor, String type) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.type = type;
        this.isBorrow = false;
    }
    @Override
    public String toString() {
        return "Book{" +
                "书名='" + bookName + '\'' +
                ", 作者='" + bookAuthor + '\'' +
                ", 类型='" + type + '\'' +
                ", 状态=" + (isBorrow?"已借出":"可借阅") +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getBorrow() {
        return isBorrow;
    }

    public void setBorrow(Boolean borrow) {
        isBorrow = borrow;
    }
}
