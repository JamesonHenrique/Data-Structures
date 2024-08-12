package list;

public class CircularSinglyLinkedList {

    public static ListNode last;
    private int lenght;
    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
    public CircularSinglyLinkedList() {
        this.last = null;
        this.lenght = 0;
    }
    public boolean isEmpty() {
        return lenght == 0;
    }
    public int lenght() {
        return lenght;
    }
    public void display() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.print(first.data);
        System.out.println();
    }
    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (last == null) {
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
        lenght++;
    }
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        lenght++;
    }
    public ListNode deleteFirst() {
        if (last == null) {
            return null;
        }
        ListNode first = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = first.next;
        }
        first.next = null;
        lenght--;
        return first;

    }
    public static void main(String[] args) {
        CircularSinglyLinkedList cSll = new CircularSinglyLinkedList();
        cSll.createCircularLinkedList();
        cSll.display();




    }
}
