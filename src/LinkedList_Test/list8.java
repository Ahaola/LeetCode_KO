package LinkedList_Test;

/**删除排序链表中的重复元素
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/
 */
public class list8 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        if(head.val != head.next.val){
            head.next = deleteDuplicates(head.next);
            return head;
        }else{
            ListNode dummy = head.next.next;
            while(dummy != null && dummy.val == head.val){
                dummy = dummy.next;
            }
            return deleteDuplicates(dummy);
        }
    }

    public static void main(String[] args) {

    }
}
