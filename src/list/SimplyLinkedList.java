package list;

import java.util.List;

public class SimplyLinkedList {

    private ListNode
            head;

    private static class ListNode<T> {
        private T
                data;
        private ListNode
                next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }


    }
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(
            String[] args) {
        SimplyLinkedList sll = new SimplyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(5);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sll.display();
        System.out.println("null");

    }
}
