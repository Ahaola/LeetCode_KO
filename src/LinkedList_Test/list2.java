package LinkedList_Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表
 */
public class list2 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
