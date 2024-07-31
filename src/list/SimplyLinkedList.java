package list;

import java.util.List;

public class SimplyLinkedList {

    public ListNode head;

    public static class ListNode<T> {
        public T data;
        public ListNode next;

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
        ListNode current = head;
        if (head == null) {
            return 0;
        }
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

    public void insert(int value, int position) {
        if (position < 1 || position > length() + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
        }
        if (position != 1) {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode newNode = new ListNode(value);
            newNode.next = previous.next;
            previous.next = newNode;

        }

    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void delete(int position) {
        if (position < 1 || position > length()) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }
    public void find(Object searchKey) {
        ListNode current = head;
        int count = 1;
        while (current != null) {
            if (current.data == searchKey) {
                System.out.println("Found at position: " + count);
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Not found");
    }
    public ListNode reverse() {
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
        SimplyLinkedList sll = new SimplyLinkedList();
        sll.head = new ListNode(10);
        sll.insert(1, 1);
        sll.insert(2, 2);
        sll.insert(6, 3);
        sll.display();


        sll.display();
        sll.find(4);

    }
}
