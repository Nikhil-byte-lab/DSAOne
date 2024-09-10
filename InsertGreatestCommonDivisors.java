
 // Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class InsertGreatestCommonDivisors {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(-1, head); // creating dummy node to hold dummy.next = head

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null){
            prev = curr;
            curr = curr.next;

            if (curr != null && prev != null){
                ListNode insertMid = gcd(prev, curr);

                insertMid.next = curr;
                prev.next = insertMid;
            }


        }
        return head;
    }

//Function to find and return GCD of Two nodes
    public ListNode gcd(ListNode A, ListNode B){
        int a_val = Math.max(A.val, B.val);
        int b_val = Math.min(A.val, B.val);

        int remainder = 1;

        while (remainder != 0){
            int base = a_val/b_val;
            remainder = a_val%b_val;
            a_val = b_val;
            b_val = remainder;
        }
        ListNode insertMid = new ListNode(a_val);
        return insertMid;
    }
}
