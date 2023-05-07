package LinkedList_Test;

/**删除链表中倒数第k个节点
 * https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
 */
public class list11 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        while(n-1 >= 0){
            fast = fast.next;
            n--;
        }
        if(fast == null){
            return slow.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
