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
    public ListNode getMiddleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
   public ListNode getNthFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value of n: " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in the list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    public void removeDuplicates() {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
    public ListNode insertInSortedList(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null || (int) head.data >= (int) newNode.data) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        ListNode current = head;
        while (current.next != null && (int) current.next.data < (int) newNode.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        SimplyLinkedList sll = new SimplyLinkedList();
        sll.head = new ListNode(10);
        sll.insert(1, 1);
        sll.insert(2, 3);
        sll.insert(6, 2);
        sll.insert(4, 4);
        sll.insert(4, 5);
        sll.display();
        ListNode middleNode = sll.getMiddleNode(sll.head);
        ListNode nthNode = sll.getNthFromEnd(3);
        System.out.println("Middle node: " + middleNode.data);
        System.out.println("Nth node from end: " + nthNode.data);
        sll.display();
        sll.insertInSortedList(7);
        sll.removeDuplicates();
        sll.display();
        sll.find(4);

    }
}
