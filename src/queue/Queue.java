package queue;

import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    public int lenght;
    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Queue() {
        front = null;
        rear = null;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public int lenght() {
        return lenght;
    }
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }
    public static void main(String[] args) {

    }

}
