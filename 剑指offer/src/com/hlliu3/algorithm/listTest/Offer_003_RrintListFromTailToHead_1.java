package com.hlliu3.algorithm.listTest;

import java.util.ArrayList;

/**
 * @className:输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @description:
 * public class ListNode {
     * int val;
     * ListNode next = null;
     * <p>
     * ListNode(int val) {
     *  this.val = val;
     * }
 * }
 * @author:
 * @date:2019-09-02 21:22
 */
public class Offer_003_RrintListFromTailToHead_1 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(67);
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(24);
        ListNode listNode3 = new ListNode(58);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        System.out.println(printListFromTailToHead(listNode));
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        //判断参数是否为null,注意边界值判断
        while (listNode != null) {
            //获取的是链表节点的值
            list.add(listNode.val);
            //获取下一个节点
            listNode = listNode.next;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        //倒转ArrayList
        for (int i = list.size() - 1; i >= 0; i--) {
            resultList.add(list.get(i));
        }
        return resultList;
    }
}

