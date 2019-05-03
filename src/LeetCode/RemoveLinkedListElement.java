package LeetCode;

public class RemoveLinkedListElement {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public ListNode removeElements(ListNode head, int val) {
            ListNode tmp = head, cur;

            while (head != null && head.val == val)
                head = head.next;

            cur = head;

            while (cur != null){
                tmp = cur.next;
                if (tmp != null && tmp.val == val){
                    cur.next = cur.next.next;
                }
                else
                    cur = cur.next;
            }
            return (head);
        }
}
