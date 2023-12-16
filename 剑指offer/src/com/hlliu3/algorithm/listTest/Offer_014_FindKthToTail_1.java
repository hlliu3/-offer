package com.hlliu3.algorithm.listTest;

/**
 * @className:链表中倒数第k个节点
 * @description:
 * 需要注意的是链表只能从头开始遍历
 * 一个节点对象遍历完成，指向的是最后一个节点，这个节点就不能再当做头了
 *
 * @author:
 * @date:2019-09-02 21:57
 */
public class Offer_014_FindKthToTail_1 {
    public static ListNode FindKthToTail(ListNode head,int k) {
        ListNode tmpHead = head;
        //统计链表的长度
        int totalNode = 0;
        while(head != null){
            totalNode++;
            head = head.next;
        }
        //注意，循环完成的head已近是最后一个了，不能再用了，用之前的保留的 tmpHead

        //当前的位置（第tempCurrentCount个节点）
        int tempCurrentCount = 0;
        //倒数第k个，就是正数第n-k+1，也就是正数第n-k个的下一个
        while(tmpHead != null && tempCurrentCount < totalNode-k+1-1){
            tempCurrentCount++;
            tmpHead = tmpHead.next;
        }
        //注意，越界的话是空
        if(totalNode-k < 0){
            tmpHead = head;
        }
        return tmpHead;
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
        System.out.println(FindKthToTail(listNode, 1).val);
    }

}
