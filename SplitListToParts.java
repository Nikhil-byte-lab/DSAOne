class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SplitListToParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int base = length / k;
        int remainder = length % k;

        temp = head;
        for (int i = 0; i < k; i++) {
            int newListSize = base + (i < remainder ? 1 : 0);
            arr[i] = temp;

            for (int j = 0; j < newListSize - 1; j++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                ListNode nextPart = temp.next;  // Save the next part
                temp.next = null;  // Disconnect this part
                temp = nextPart;  // Move to the next part
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SplitListToParts part = new SplitListToParts();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode[] result = part.splitListToParts(head, 5);
        for (ListNode node : result) {
            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
            System.out.println();
        }
    }
}
