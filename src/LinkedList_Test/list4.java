package LinkedList_Test;

/**
 * 链表中倒数第k个节点
 */
public class list4 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k <= 0 || head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while((k-1) != 0){
            fast = fast.next;
            if(fast == null){
                return null;
            }
            k--;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}
