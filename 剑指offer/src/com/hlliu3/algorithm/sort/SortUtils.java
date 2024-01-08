package com.hlliu3.algorithm.sort;

public class SortUtils {

    /**
     * Math.random() -> [0,1)���е�С�����ȸ��ʷ���һ��
     *
     * @param maxSize
     * @param maxValue
     * @return
     */
    public static int[] generateRandomArray(int maxSize,int maxValue){

        //�������
        int[] arr = new int[(int)((maxSize + 1) * Math.random())];
        //�������
        for (int i = 0; i < arr.length; i++) {
            //ȫ��Χ��������
            arr[i] = (int)((maxValue + 1) * Math.random()) - (int)(maxValue * Math.random());
        }
        return arr;
    }

    public static void main(String[] args) {
        int testTime = 50000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize,maxValue);
            int[] arr2 = copyArray(arr1);
            //����1 arr1
            //����2 arr2
            if(!isEquals(arr1,arr2)){
                succeed = false;
                break;
            }
        }

        System.out.println(succeed ? "Nice!" : "No!");

    }
    public static int[] copyArray(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    
    public static boolean isEquals(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (! (arr1[i] == arr2[i]) ) {
                return false;
            }
        }
        return true;
    }

}
