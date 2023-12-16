package com.hlliu3.algorithm.listTest;

/**
 * @className:
 * @description:反转链表
 * @author:
 * @date:2019-09-02 22:25
 */
public class Offer_015_Reverse_1 {

    public ListNode ReverseList(ListNode head) {

        if(head==null){
            return null;
        }

        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while(pNode!=null){
            //下一个节点
            ListNode pNext = pNode.next;
            if(pNext==null){
                newHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return newHead;
    }
}
