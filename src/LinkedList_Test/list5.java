package LinkedList_Test;

/**
 * 链表回文结构
 */
public class list5 {
    public boolean chkPalindrome(ListNode head) {
        if(head == null){//没有节点
            return false;
        }
        if(head.next == null){
            return true;//只有一个头节点
        }
        //1、找中间节点
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //2、反转中间节点后面的节点
        ListNode cur = slow.next;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3、head从前往后走，cur从后往前走比较
        while(head != null && slow != null){
            if(head.val != slow.val){
                return false;
            }
            if(head.next == slow){
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
