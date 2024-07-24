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

    }
    public static void main(
            String[] args) {
        SimplyLinkedList sll = new SimplyLinkedList();
        sll.insertFirst(1);
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(4);
        sll.insertFirst(5);
        sll.display();
        System.out.println("Length of the list: " + sll.length());


    }
}
