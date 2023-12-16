package com.hlliu3.algorithm.sort;

public class Code01_SelectSort {
    //—°‘Ò≈≈–Ú
    public static void selectionSort(int[] arr){
        
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1 ; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i] ;
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {32,42,12,65,321,32,32,12,8,23,12,65};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

}
