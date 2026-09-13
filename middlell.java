class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode lo = hi;
        ListNode hi = head;
        while (hi != null && hi.next != null) {
            lo=lo.next;
            hi=hi.next.next;
        }
        return lo;
    }
}
