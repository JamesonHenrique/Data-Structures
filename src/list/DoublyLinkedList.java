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
    public static void main(String[] args) {

    }
}
