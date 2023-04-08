package LinkedList_Test;

/**
 * 反转链表
 */
public class list3 {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while(cur != null){
            ListNode curNext = cur.next;
            //头插法
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
