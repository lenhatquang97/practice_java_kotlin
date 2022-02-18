public class DeleteDuplicates {
    public static void deleteDuplicates(ListNode head){
        if(head == null || head.next == null) return;
        for(ListNode tmp = head; tmp != null; tmp = tmp.next){
            ListNode prev = tmp;
            ListNode iter1 = tmp.next;
            while(iter1 != null){
                if(tmp.val != iter1.val) {
                    prev = iter1;
                    iter1 = iter1.next;
                    continue;
                }
                while(iter1 != null && tmp.val == iter1.val){
                    prev.next = iter1.next;
                    iter1 = iter1.next;
                }
            }
        }
    }
}
