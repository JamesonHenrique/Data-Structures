package heap;

public class MaxPQ {
    private Integer[] heap;
    private int n;

    public MaxPQ(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void insert(int x) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    private void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2; // bcoz we need to continue shifting up till
            // new value inserted is at correct position
        }
    }

    private void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void printMaxHeap() {
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }


    public static void main(String[] args) {
        MaxPQ maxHeap = new MaxPQ(3);
        maxHeap.insert(6);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(1);
        maxHeap.insert(2);
        maxHeap.insert(4);
        maxHeap.printMaxHeap();
    }
}

