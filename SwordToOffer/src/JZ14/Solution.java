package JZ14;

public class Solution {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        ListNode first = pHead;
        for (int i = 0; i < k; i++) {
            if (first == null) return first;
            first = first.next;
        }
        ListNode last = pHead;
        while (first != null) {
            last = last.next;
            first = first.next;
        }
        return last;
    }
}
