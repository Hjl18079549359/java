package com.day0421.bookManageSystem;

public class MainSystem {
    public static void main(String[] args) {
//        创建角色
        Role normalUser = new Role("普通用户");
//        创建用户
        User  user=new User(normalUser,"男",18,"huang",1001);
//      创建图书
        Book book1 = new Book("黄谨来", "Java基础", "教材");
        Book book2 = new Book("张三", "数字图像处理", "小说");
        Book book3 = new Book("李四", "西游记", "名著");
//      测试借书
        user.borrow(book1);
        user.borrow(book2);
        user.borrow(book3);
//       查看已借图书
        user.showMyBooks();
//       测试还书
        user.returnBook(book2);
        user.showMyBooks();
    }
}
