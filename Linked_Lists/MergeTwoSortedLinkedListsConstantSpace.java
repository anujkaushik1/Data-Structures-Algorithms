import java.util.*;

class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = l1;
        ListNode t2 = l2;
        
        ListNode t3 = dummy;
        ListNode h3 = dummy;
        
        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                t3.next = t1;
                t3 = t1;
                t1 = t1.next;
            }
            else{
                t3.next = t2;
                t3 = t2;
                t2 = t2.next;
            }
        }
        
        if(t1 == null){
            t3.next = t2;
        }
        else{
            t3.next = t1;
        }
        
        return h3.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);
        int m = scn.nextInt();
        ListNode h2 = createList(m);


        ListNode head = mergeTwoLists(h1, h2);
        printList(head);
    }
}
