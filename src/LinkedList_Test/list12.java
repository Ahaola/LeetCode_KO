package LinkedList_Test;

/**
 * 分隔链表 https://leetcode.cn/problems/partition-list/
 */
public class list12 {
    public ListNode partition(ListNode head, int x) {
        ListNode q1 = new ListNode(0);
        ListNode q1head = q1;
        ListNode q2 = new ListNode(0);
        ListNode q2head = q2;
        while(head != null){
            if(head.val < x){
                q1.next = head;
                q1 = q1.next;
            }else{
                q2.next = head;
                q2 = q2.next;
            }
            head = head.next;
        }
        q2.next = null;
        q1.next = q2head.next;
        return q1head.next;
    }

    public static void main(String[] args) {

    }
}
