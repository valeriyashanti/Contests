package Sorts;

public class mergeTwoLists {
        public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public static void main(String[] args) {
        new mergeTwoLists().run();
    }

    private void run() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(8);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println(mergeTwoLists(l1, n1));
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0), c = tmp;
        while (l1 != null || l2 != null){
            if (l1 == null || (l2 != null && l1.val >= l2.val)) {
                c = c.next = l2;
                l2 = l2.next;
            } else if (l2 == null || (l1 != null && l2.val >= l1.val)){
                c = c.next = l1;
                l1 = l1.next;
            }
        }
        return tmp.next;
    }
}
