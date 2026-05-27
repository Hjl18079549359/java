package com.day0512;

import java.util.NoSuchElementException;

public class MyLinkList {
//    链表头
    private Node first;
//    链表尾
    private Node last;
//    链表长度
    private int size;
    public Object getFirst() {
        if (first == null) {
            throw new NoSuchElementException("列表为空，还没有存数据。");
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
//            如果链表的尾为空，则链表为空
            first=newNode;
        }else {
            lastNode.next=newNode;
        }
//        长度
        size++;

    }
//    头插法
    public void linkfirst(Object data) {
//        长度，之前头结点的前指向，头结点变化
//        保存之前的前节点
        Node firstNode = first;
//        创建新节点
        Node newNode = new Node(null,firstNode,data);
//        新的新节点
        first=newNode;
//        原来前节点的前指向变了
        if (firstNode==null) {
            last=newNode;
        }else  {
            firstNode.prev=newNode;
        }
//        长度
        size++;
    }
//    获取元素
    public Object get(int index){
        if (index<0 || index>size-1){
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
        return getNode(index).data;
    }
    private Node getNode(int index){
//        找到头结点，然后一个一个往后移动
        if(index<(size>>1)){
            Node node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }else {
            Node node = last;
            for (int i = size-1; i >index; i--) {
                node = node.prev;
            }
            return node;
        }
    }
//    插入添加
    public void add(int index,Object data) {
//        判断下标是否越界[0,size]
        if (index<0 || index>size){
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
        if (index==size){
            linklast(data);
        }else {
//            在index处添加新元素
//            长度，原位置处的前指向元位置的后指向
//            获取原位置节点
            Node next= getNode(index);
//            创建新节点
            Node newNode = new Node(next.prev,next,data);
            Node pre = getNode(index-1);//原节点的前一个节点
            if (pre==null){
//                源节点为头结点，改为新节点
                first=newNode;
            }else {
                pre.next = newNode;
            }
//            原位置处的钱节点，改为新节点
            next.prev=newNode;
            size++;
        }
    }
//    set(int index,Object data)修改
    public void set(int index,Object data){
//        判断被修改值索引是否合法
        if (index<0 || index>size){
            throw new ArrayIndexOutOfBoundsException("下标越界了");
        }
//        找到index对应的节点并修改节点的值
        getNode(index).data=data;

    }
//    remove(int index)下标删除
    public void remove(int index){
//        判断要删除节点的索引是否合法
        if (index<0 || index>size){
            throw new ArrayIndexOutOfBoundsException("下标越界了");
        }
//        获取该索引的节点
        Node node= getNode(index);
//        获取节点的值
        Object data=node.data;
//        根据值删除节点
        remove(data);
    }
//    remove(Object data)对象删除
    public void remove(Object object){
//        判断值是否存在
        if (contains(object)){
//            获取值的索引
            int index=indexOf(object);
//            获取删除节点的前一个节点
            Node prev=getNode(index).prev;
//            获取删除节点的后一个节点
            Node next=getNode(index).next;
//            删除后，prev的后继是next,next的前驱是prev
            prev.next=next;
            next.prev=prev;
//            链表长度减1
            size--;
        }
    }
//    contains(Object data)对象是否存在
    public boolean contains(Object object) {
//        判断值是否存在
        return indexOf(object)>=0;
    }

//    indexOf(Object data) 返回对象首次出现的下标
    public int indexOf(Object object) {
//        计数器，记录值所在节点的位置索引
        int index=0;
        if (object==null){
            for (Node x = first; x != null; x = x.next) {
                if (x.data==null){
                    return index;
                }
                index++;
            }
        }else  {
            for (Node x = first; x != null; x = x.next) {
                if (x.data.equals(object)){
                    return index;
                }
                index++;
            }
        }
        return -1;
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
        MyLinkList list = new MyLinkList();
        list.linkfirst("HUANG");
        list.linkfirst("wang");
        list.linklast("gao");
        list.linklast("1");
        list.linklast("2");
        list.linklast("3");
        System.out.println(list.getSize());
        System.out.println(list.get(4));
    }
}
