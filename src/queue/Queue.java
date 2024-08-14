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
    public void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        lenght++;

    }
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        lenght--;
        return result;
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
