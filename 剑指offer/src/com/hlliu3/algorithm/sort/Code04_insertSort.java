package com.hlliu3.algorithm.sort;

/**
 * ��������
 * ��֤��һλ����
 * ��֤ǰ��λ���� ��2λ�͵�1λ�Ƚϣ���2λС����
 * ��֤ǰ��λ���� ��3λ�͵�2λ�Ƚϣ���3λС��������3λ�󣬲��ö�����ʱ��������״̬��ǰ��λһ��������ģ�
 * �ʹ���ʱ�����ƺ���루����ǰ�Ѿ���������ˣ�
 * ѡ���ð��һ����O(N^2)
 *
 * 7 6 5 4 3 2 1 ��(o)N^2�����ֻ��� 1 2 3 4 5 6 7 o(N) ���ǰ����������� Ҳ�� ��o��N^2 (��o��ָ������)
 */
public class Code04_insertSort {
    public  static void insertionSort(int[] arr){
        if(arr == null || arr.length < 2 ) {
            return;
        }
        //0��i���� ��0~0����0~i��Ҫ����
        for (int i = 1; i < arr.length; i++) {

            for (int j = i - 1 ; j >= 0 && arr[j] > arr[j + 1]; j--) {
                //��0~i��ȫ��������j=0ʱ����0~i��ǰһ���Ѿ��Ⱥ�һ��Сʱ���ҵ�����λ��t,0~t����t��i��Ҫ������������ֹͣ�ڲ�ѭ��


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
