package list;

public class DoublyLinkedList {
    public static ListNode head;
    public static ListNode tail;
    private int lenght;
    public class ListNode {
        public int data;
        public ListNode next;
        public ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }


    }
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.lenght = 0;
    }
    public boolean isEmpty() {
        return lenght == 0;
    }
    public int lenght() {
        return lenght;
    }
    public void displayForward() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void displayBackward() {
        if (tail == null) {
            return;
        }
        ListNode current = tail;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.previous;
        }
        System.out.print("null");
        System.out.println();
    }
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        lenght++;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.displayForward();
        dll.displayBackward();
    }
}
