package LeetCode;

public class MergeTwoLists {
    public static void main(String[] args) {
    }
        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode tmp = null;
            if (l1 == null)
                return (l2);
            if (l2 == null)
                return (l1);

            if (l1.val < l2.val) {
                tmp = l1;
                l1 = l1.next;
            } else {
                tmp = l2;
                l2 = l2.next;
            }
            ListNode merge = tmp;
            while (l1 != null && l2 != null){
                if (l1.val <= l2.val){
                    merge.next = l1;
                    l1 = l1.next;
                } else {
                    merge.next = l2;
                    l2 = l2.next;
                }
                merge = merge.next;
            }

            while (l1 != null){
                merge.next = l1;
                l1 = l1.next;
                merge = merge.next;
            }
            while (l2 != null){
                merge.next = l2;
                l2 = l2.next;
                merge = merge.next;
            }
            return (tmp);
        }
}

