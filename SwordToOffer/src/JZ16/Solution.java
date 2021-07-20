package JZ16;

public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1);
        ListNode root = temp;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        if (list1 == null)
            temp.next = list2;
        else temp.next = list1;
        return root.next;
    }
}