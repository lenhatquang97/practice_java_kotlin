public class KFromEnd {
    public int returnNthFromEnd(ListNode head, int k) {
        if (head == null) return -1;
        ListNode slow = head;
        ListNode fast = head;
        while (k>1){
            if (fast == null) return -1;
            fast = fast.next;
            k--;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    } 
}
