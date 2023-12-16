package com.hlliu3.algorithm.sort;

public class Code02_BubbleSort {
    //冒泡排序
    public static void bubbleSort(int[] arr){
        if( arr == null || arr.length < 2){
            return ;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    /**
                     * 亦或运算 相同为0 不同为1
                     * 亦或运算无进位相加 (a有五个二进制位(10111)，b有五个二进制位(00001)，c有五个二进制位(10100)) 每一位偶数个就是0，奇数个数就是1
                     *
                     *  1） 0 ^ N = N   N ^ N = 0
                     *  2)  交换律 结合律 a^b=b^a (a^b)^c = a^(b^c)
                     *  3) 同一批数亦或不管先后，结果是一样的
                     *  a = 甲  b = 乙
                     *  a = a ^ b; a = 甲 ^ 乙   b = 乙
                     *  b = a ^ b; a = 甲 ^ 乙   b = 甲 ^ 乙 ^ 乙 = 甲 ^ 0 = 甲
                     *  a = a ^ b; a = 甲 ^ 甲 ^ 乙 = 0 ^ 乙 = 乙   b = 甲
                     *  必须保证 a指向的内存和b指向的内存是不同的 如果 arr[i] 和 arr[j] 但是i位置不能等于j位置，否则相同位置亦或，结果是0
                     */

                    //无需额外变量
                    arr[j] = arr[j] ^ arr[j+1]; // a = 甲^乙 b =
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {32,42,12,65,321,32,32,12,8,23,12,65};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }

    }

}
