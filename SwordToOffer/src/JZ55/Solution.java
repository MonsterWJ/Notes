package JZ55;

import utils.ListNode;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        do {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
