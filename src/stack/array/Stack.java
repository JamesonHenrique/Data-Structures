package stack.array;

public class Stack {
   public int top;
    public int[] array;
    public Stack(int capacity) {
        array = new int[capacity];
        this.top = -1;
    }
    public void push(int data) {
        if (isFull()) {
          throw new StackOverflowError("Stack is full");
        }
        array[++top] = data;
    }
    public boolean isFull() {
        return array.length == size();
    }
    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Stack is empty");
        }
        return array[top--];
    }
    public int peek() {
        if (isEmpty()) {
            throw new StackOverflowError("Stack is empty");
        }
        return array[top];
    }
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " --> ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // stack.push(6);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
    }
}
