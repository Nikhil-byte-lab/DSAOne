//Given the head of a linked list, the task is to find the middle. For example, the middle of 1-> 2->3->4->5 is 3. If there are two middle nodes (even count), return the second middle. For example, middle of 1->2->3->4->5->6 is 4.

class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class GetMiddle {
    int getMiddle(Node head) {
        // Your code here.
        int count = 0;
        Node dummy = new Node(-1);
        dummy.next = head;
        Node temp = dummy;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        int limit = (count % 2) == 0? count/2 : (count/2)+1;
        temp = dummy;
        for (int i=0; i<limit; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        GetMiddle gm = new GetMiddle();
        Node head = new Node(1);
        Node num2 = new Node(2);
        Node num3 = new Node(3);
        Node num4 = new Node(4);
        Node num5 = new Node(5);
        Node num6 = new Node(6);

        head.next = num2;
        num2.next = num3;
        num3.next = num4;
        num4.next = num5;
        num5.next = num6;
        System.out.println(gm.getMiddle(head));
    }
}
