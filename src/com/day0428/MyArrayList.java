package com.day0428;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
//    属性
    private int size;//容量
    private Object[] array;//数据的数组
    public MyArrayList(){
        array = new Object[1];
    }
    public MyArrayList(int size){
        if (size<0){
            throw new IllegalArgumentException("参数错误");
        }
        array = new Object[size];
    }
    private void ensureSize(int size){
        if (!(size<array.length)){
            //扩容
            grow(size);
        }
    }
    private void grow(int size){
//        System.out.println("扩容");
        int newSize = array.length + (array.length>>1);
//        System.out.println(newSize);
        if (newSize<size){
            newSize=size;
        }
        array = Arrays.copyOf(array,newSize);
    }
//    add(e)
    public void add(Object o){
        ensureSize(size + 1);
        //容量够不够
        array[size++] = o;
    }
    //    add(index,e)
    public void add(int index,Object o){
        ensureSize(size + 1);
//        System.arraycopy(array,index,array,index+1,size-index);
//        array[index] = o;
        for (int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index]=o;
        size++;
    }

//    remove(e)
    public void  remove(Object o){
        int index=indexOf(o);
        System.arraycopy(array,index+1,array,index,size-index);
    }
//    remove(index)
    public void remove(int index){
//        if (!isOutOfBounds(index)){
//            System.arraycopy(array,index+1,array,index,size-index);
//        }
        System.arraycopy(array,index+1,array,index,size-index);
        size--;
    }
//    set(index,e)
    public void set(int index,Object o){
        if (index<0 || index>=size){
            throw new IllegalArgumentException("数组下标越界了");
        }
        array[index]=o;
    }
//    contains(e)
    public Boolean contains(Object o){
        return indexOf(o)>=0;
    }
//    indexOf(e)
    public int indexOf(Object o){
        for (int i=0;i<size;i++){
            if (array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
//    lastIndexOf(e)
    public int lastIndexOf(Object o){
        for (int i=size-1;i>=0;i--){
            if (array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
//    get(index)
    public Object get(int index){
        if (index<0 || index>=size){
            throw new IllegalArgumentException("数组下标越界了");
        }
        return array[index];
    }
    private boolean isOutOfBounds(int index){
        if (index<0 || index>=size){
            throw new IllegalArgumentException("数组下标越界了");
        }
        return true;
    }
public static void main(String[] args) {
    MyArrayList list=new MyArrayList();
//    System.out.println(list.size);
    list.add("aa");
    list.add("bb");
    list.add("cc");
    list.add("dd");
    list.add(1,"ee");
    list.remove(1);
    System.out.println(list.get(1));
}
}
