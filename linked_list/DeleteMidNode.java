package linked_list;

public class DeleteMidNode {
    public ListNode deleteMiddleNode(ListNode head){
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = head;
        while(prev.next != slow){
            prev = prev.next;
        }
        prev.next = slow.next;
        return head;
    }
}
