package com.day0421.bookManageSystem;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private  Role role;
    private Book[] arr = new Book[5];
    private int n = 0;          // 已借图书数量
    public User() {
    }
    public User(Role role, String sex, Integer age, String name, Integer id) {
        this.role = role;
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.id = id;
    }
    public void borrow(Book b) {
        if (n == 5) { // 数组长度为5，下标0-4，n=5表示已借满
            System.out.println("借不了了，已达到最多可借5本的上限！");
            return;
        }
        if (b.getBorrow()) {
            System.out.println("这本书已经被借走了！");
            return;
        }
        arr[n] = b;
        n++;
        b.setBorrow(true);
        System.out.println("借书成功！已借第" + n + "本");
    }
    public void returnBook(Book b) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == b) {
                // 把后面的书往前移
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = null;
                n--;
                b.setBorrow(false);
                System.out.println("还书成功！");
                return;
            }
        }
        System.out.println("你没有借这本书！");
    }

    // 查看已借图书
    public void showMyBooks() {
        System.out.println(name + "的已借图书：");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
