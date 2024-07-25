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
    public int length() {
        if(head == null) {
            return 0;
        }
        ListNode current = head;
        int lenght = 0;
        while (current != null) {
            lenght++;
            current = current.next;
        }
     return lenght;
    }
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int value) {
ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }
    public static void main(
            String[] args) {
        SimplyLinkedList sll = new SimplyLinkedList();
        sll.insertLast(1);
        sll.insertLast(2);
        sll.insertLast(3);
        sll.insertLast(4);
        sll.insertLast(5);
        sll.display();
        System.out.println("Length of the list: " + sll.length());


    }
}
