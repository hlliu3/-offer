package com.hlliu3.listTest;

/**
 * @className:输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @description:
 * @author:
 * @date:2019-09-03 22:11
 */
public class Offer_016_MergeSortedList_1 {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode tmpList1 = null;
        ListNode tmpList2 = null;
        ListNode newList = null;
        ListNode tmpNewList = null;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                if (newList == null) {
                    newList = list2;
                    tmpNewList = newList;
                } else {
                    newList.next = list2;
                    newList = newList.next;
                }

                list2 = list2.next;
            } else {
                if (newList == null) {
                    newList = list1;
                    tmpNewList = newList;
                } else {
                    newList.next = list1;
                    newList = newList.next;
                }

                list1 = list1.next;
            }
        }
        while (list1 != null) {
            if(newList == null){
                newList = list1;
                tmpNewList = newList;
            }else{
                newList.next = list1;
                newList = newList.next;
            }
            list1 = list1.next;
        }
        while (list2 != null) {
            if(newList == null){
                newList = list2;
                tmpNewList = newList;
            }else {
                newList.next = list2;
                newList = newList.next;
            }
            list2 = list2.next;
        }
        return tmpNewList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNode5 = null;
        /*ListNode listNode5 = new ListNode(1);
        ListNode listNode6 = new ListNode(2);
        ListNode listNode7 = new ListNode(3);
        ListNode listNode8 = new ListNode(4);
        ListNode listNode9 = new ListNode(5);
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;*/
        //System.out.println(Merge(listNode, listNode5));
        ListNode listNode10 = Merge(listNode, listNode5);
        while(listNode10 != null){
            System.out.println(listNode10.val);
            listNode10 = listNode10.next;
        }

    }
}
