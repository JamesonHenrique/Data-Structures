package list.leetcode;

import list.SinglyLinkedList;

//Leetcode #206
public class ReverseSimplyLinkedList extends SinglyLinkedList {


    public static ListNode reverse() {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


    public static void main(String[] args) {
        ReverseSimplyLinkedList sll = new ReverseSimplyLinkedList();
        sll.insertFirst(1);
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(4);
        sll.display();
        sll.head = reverse();
        System.out.println("After reversing: " );
        sll.display();

    }
}
