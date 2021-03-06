import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregateEvenOdd(ListNode head) {
        
        ListNode curr = head;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        
        ListNode oh = odd;
        ListNode ot = odd;
        
        ListNode eh = even;
        ListNode et = even;
        
        while(curr != null){
            
            int data = curr.val;
            if(data % 2 == 0){
                et.next = curr;
                et = curr;
            }
            else{
                ot.next = curr;
                ot = curr;
            }
            curr = curr.next;
        }
          
            et.next = oh.next;
            ot.next = null;
            return eh.next;
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = segregateEvenOdd(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
