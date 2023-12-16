package com.hlliu3.algorithm.sort;

public class Code02_BubbleSort {
    //ð������
    public static void bubbleSort(int[] arr){
        if( arr == null || arr.length < 2){
            return ;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    /**
                     * ������� ��ͬΪ0 ��ͬΪ1
                     * ��������޽�λ��� (a�����������λ(10111)��b�����������λ(00001)��c�����������λ(10100)) ÿһλż��������0��������������1
                     *
                     *  1�� 0 ^ N = N   N ^ N = 0
                     *  2)  ������ ����� a^b=b^a (a^b)^c = a^(b^c)
                     *  3) ͬһ������򲻹��Ⱥ󣬽����һ����
                     *  a = ��  b = ��
                     *  a = a ^ b; a = �� ^ ��   b = ��
                     *  b = a ^ b; a = �� ^ ��   b = �� ^ �� ^ �� = �� ^ 0 = ��
                     *  a = a ^ b; a = �� ^ �� ^ �� = 0 ^ �� = ��   b = ��
                     *  ���뱣֤ aָ����ڴ��bָ����ڴ��ǲ�ͬ�� ��� arr[i] �� arr[j] ����iλ�ò��ܵ���jλ�ã�������ͬλ����򣬽����0
                     */

                    //����������
                    arr[j] = arr[j] ^ arr[j+1]; // a = ��^�� b =
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
