package com.day0428;

public class MyLinkList {
//    链表头
    private Node first;
//    链表尾
    private Node last;
//    链表长度
    private int size;
    public Object getFirst() {
        if (first == null) {
            return null;
        }
        return first.data;
    }
    public Object getLast() {
        if (last == null) {
            return null;
        }
        return last.data;
    }
    public int getSize() {
        return size;
    }
//    尾插法
//    元素插入后发生哪些变化
    public void linklast(Object data) {
//        长度，链表的尾发生变化，原来的尾节点的后指向发送变化
//        保存之前的尾结点
        Node lastNode = last;
//        创建新节点
        Node newNode = new Node(lastNode,null,data);
//        新的尾结点
        last=newNode;
//        原来尾结点指向变了
        if (lastNode==null) {
            first=newNode;
        }else {
            lastNode.next=newNode;
        }
//        长度
        size++;

    }
//    用来封装外部传来的数据，成为一个节点
    private class Node{
        Node prev;//前指向
        Node next;//后指向
        Object data;//真实数据

        public Node(Node prev, Node next, Object data) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
    }
    public static void main(String[] args) {

    }
}
