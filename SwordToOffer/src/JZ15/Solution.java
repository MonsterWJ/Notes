package JZ15;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode rHead = head;
        ListNode rNext = null;
        ListNode rPre = rHead.next;
        while (rHead != null) {
            rPre = rHead.next;
            rHead.next = rNext;
            rNext = rHead;
            rHead = rPre;
        }
        return rNext;
    }
}
