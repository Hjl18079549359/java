package com.day03;

public class A4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 1, 1, 2, 3, 4, 5};

        // 遍历数组中的每个元素
        for (int i = 0; i < arr1.length; i++) {
            int count = 0; // 统计当前元素出现的次数
            // 内层循环：统计arr1[i]在数组中出现的总次数
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                }
            }
            // 若次数为1，说明是不重复的元素，输出
            if (count == 1) {
                System.out.println(arr1[i]);
            }
        }
    }
}