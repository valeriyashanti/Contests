package LeetCode;

public class FindMiddleOfLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public ListNode middleNode(ListNode head) {
            int amount = 0;
            ListNode tmp = head;
            while (tmp != null){
                tmp = tmp.next;
                amount++;
            }
            tmp = head;
            if (amount % 2 == 0)
                amount = amount / 2;
            else
                amount /= 2;
            while (amount > 0){
                tmp = tmp.next;
                amount--;
            }
            return (tmp);
        }
}
