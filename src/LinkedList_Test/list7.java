package LinkedList_Test;

/**
 * 相交链表：https://leetcode.cn/problems/intersection-of-two-linked-lists/submissions/
 */
public class list7 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //1.先求链表的长度
        ListNode p1 = headA;
        ListNode p2 = headB;
        int lenA = 0;//假设lenA是最长的那个链表
        int lenB = 0;
        while(p1!= null){
            lenA++;
            p1 = p1.next;
        }
        while(p2!= null){
            lenB++;
            p2 = p2.next;
        }
        p1 = headA;
        p2 = headB;
        int len = lenA - lenB;
        if(len< 0){
            p1 = headB;
            p2 = headA;
            len = lenB - lenA;
        }
        //p1永远指向最长的链表 p2永远指向最短的链表
        while(len!=0){
            p1 = p1.next;
            len--;
        }
        //这个时候p1 和 p2 在相同的起始位置
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        if(p1 == null){
            return null;
        }
        return p1;
    }
}
