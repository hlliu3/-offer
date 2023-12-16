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
    //����������ż���Σ�1����������
    public static void findOneDiff(int[] arr){
        int eor = 0;
        for (int i : arr) {
            eor = eor ^ i;
        }
        System.out.println(eor);
    }
    //����������ż���Σ�2���������Σ���ͬ��a b ��
    public static void findOneDiff2(int[] arr){
        int eor = 0;
        for (int i : arr) {
            eor = eor ^ i;
        }
        //(2�������ε��� a^b  ������λĳһλ��һ����1�������ǵ�8λ���õ�һ����eorT)
        //��������1��λ����
        /**
         * 1010111100 eor
         * 0101000011 ~eor
         * 0101000100 ~eor+1
         * 0000000100 eor & (~eor+1)
         */
        int eorT = eor & (~eor + 1);
        //��8λ����1����������eor'���,�����a������b
        int onlyOne = 0; //eor'
        for (int i : arr) {

            if((i & eorT) == 1){ //����eorT�Ǹ������Ҳ�����1�ģ�eorT���ж�����λֻ��һ��1��
                onlyOne ^= i;//��eor'���
            }
        }


        System.out.println(onlyOne);
        System.out.println(eor ^ onlyOne);

    }
    public static void main(String[] args) {
        int[] arr = {32,42,12,65,321,32,32,12,8,23,12,65};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }

        System.out.println();
        int[] arr1 = {32,32,32,32,22,22,22,12,22,11,11};
        findOneDiff(arr1);

        System.out.println();
        int[] arr2 = {32,32,13,22,22,22,12,22,11,11};
        findOneDiff2(arr2);
    }

}
