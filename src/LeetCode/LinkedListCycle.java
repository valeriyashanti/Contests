package LeetCode;

public class LinkedListCycle {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode tmp = head;

            if (head == null)
                return (false);

            while (tmp.next != null) {
                tmp = tmp.next.next;
                head = head.next;
                if (tmp == null)
                    return (false);
                if (tmp.val == head.val)
                    return (true);

            }
            return (false);
        }
    }
}
