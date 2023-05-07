package LinkedList_Test;

/** 旋转链表
 * https://leetcode.cn/problems/rotate-list/
 */
public class list9 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        int len = getlength(head);
        k = k%len;
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
    public int getlength(ListNode head){
        int len = 0;
        while(head != null){
            head = head.next;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {

    }
}
