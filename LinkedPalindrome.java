import java.util.ArrayList;

public class LinkedPalindrome {
    boolean isPalindrome(Node head) {
//        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        int count = 0;
        while(temp != null){
//            list.add(temp.data);
            count++;
            temp = temp.next;
        }
        int arr[] = new int[count];
        int i = 0;
        temp = head;
        while(temp != null){
            arr[i] = temp.data;
            temp = temp.next;
            i++;
        }


        int r = arr.length - 1;


        for (int l = 0; l <= r ; l++, r--) {
            if (arr[l] != arr[r]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedPalindrome lp = new LinkedPalindrome();
        Node head = new Node(590);
        head.next = new Node(620);
        head.next.next = new Node(80);
//        head.next.next.next = new Node(596);
//        head.next.next.next.next = new Node(1);
//        head.next.next.next.next.next = new Node(1);
//        head.next.next.next.next.next.next = new Node(596);
//        head.next.next.next.next.next.next.next = new Node(677);
//        head.next.next.next.next.next.next.next.next = new Node(961);
//        head.next.next.next.next.next.next.next.next.next = new Node(375);

        System.out.println(lp.isPalindrome(head));
    }
}
