package com.hlliu3.algorithm.sort;

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
public class Code03_SelectOneOrTwoDiffNum {
    //其他所有数偶数次，1个数奇数次
    public static void findOneDiff(int[] arr){
        int eor = 0;
        for (int i : arr) {
            eor = eor ^ i;
        }
        System.out.println(eor);
    }
    //其他所有数偶数次，2个数奇数次（不同数a b ）
    public static void findOneDiff2(int[] arr){
        int eor = 0;
        for (int i : arr) {
            eor = eor ^ i;
        }
        //(2个奇数次的数 a^b  二进制位某一位上一定是1，假如是第8位，得到一个数eorT)
        //找二进制最后边是1的位的数
        /**
         * 1010111100 eor
         * 0101000011 ~eor
         * 0101000100 ~eor+1
         * 0000000100 eor & (~eor+1)
         */
        int eorT = eor & (~eor + 1);
        //第8位上是1的所有数和eor'亦或,结果是a或者是b
        int onlyOne = 0; //eor'
        for (int i : arr) {

            if((i & eorT) == 1){ //所有eorT那个数最右侧数是1的（eorT所有二进制位只有一个1）
                onlyOne ^= i;//和eor'亦或
            }
        }


        System.out.println(onlyOne);
        System.out.println(eor ^ onlyOne);

    }

    public static void main(String[] args) {
        System.out.println();
        int[] arr1 = {32,32,32,32,22,22,22,12,22,11,11};
        findOneDiff(arr1);

        System.out.println();
        int[] arr2 = {32,32,13,22,22,22,12,22,11,11};
        findOneDiff2(arr2);
    }
}
