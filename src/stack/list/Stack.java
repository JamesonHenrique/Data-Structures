package stack.list;

public class Stack {
    public ListNode top;
    public int length;
    public class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Stack() {
        this.top = null;
        this.length = 0;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int length() {
        return length;
    }

    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
        length++;

    }
    public void pop() {
        if (top == null) {
            return;
        }
        top = top.next;
        length--;
    }
    public void display() {
        ListNode current = top;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.pop();
        stack.display();
    }
}
