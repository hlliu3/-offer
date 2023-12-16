package com.hlliu3.algorithm.sort;

/**
 * 插入排序
 * 保证第一位有序
 * 保证前两位有序 第2位和第1位比较，第2位小交换
 * 保证前三位有序 第3位和第2位比较，第3位小交换，第3位大，不用动（此时数据有了状态，前两位一定是有序的）
 * 和打牌时摸到牌后插入（插入前已经是有序的了）
 * 选择和冒泡一定是O(N^2)
 *
 * 7 6 5 4 3 2 1 （(o)N^2）这种或者 1 2 3 4 5 6 7 o(N) 但是按最差情况估计 也是 （o）N^2 (大o是指最差情况)
 */
public class Code04_insertSort {
    public  static void insertionSort(int[] arr){
        if(arr == null || arr.length < 2 ) {
            return;
        }
        //0到i有序 （0~0有序，0~i想要有序）
        for (int i = 1; i < arr.length; i++) {

            for (int j = i - 1 ; j >= 0 && arr[j] > arr[j + 1]; j--) {
                //当0~i上全部交换完j=0时或者0~i上前一个已经比后一个小时（找到插入位置t,0~t有序，t到i需要挨个交换），停止内层循环


                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {32,42,12,65,321,32,32,12,8,23,12,65};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }

    }

}
