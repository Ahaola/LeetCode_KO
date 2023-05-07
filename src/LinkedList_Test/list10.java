package LinkedList_Test;

/**两两交换链表中的节点
 * https://leetcode.cn/problems/swap-nodes-in-pairs/
 */
public class list10 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = head.next;
        head.next = swapPairs(dummy.next);
        dummy.next = head;
        return dummy;
    }

    public static void main(String[] args) {

    }
}
