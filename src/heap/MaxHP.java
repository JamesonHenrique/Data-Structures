package heap;

public class MaxHP {
    private int[] heap;
    private int n;
    public MaxHP(int capacity) {
        heap = new int[capacity + 1];
        n = 0;
    }
    public Boolean isEmpty() {
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

    private void resize(int i) {
        int[] temp = new int[i];
        for (int j = 0; j < heap.length; j++) {
            temp[j] = heap[j];
        }
        heap = temp;
    }

    private void swim(int n) {
        int k = n;
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;
        }

    }
public void printMaxHeap() {
    for (int i = 1; i <= n / 2; i++) {
        System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2 * i] + " RIGHT CHILD : " + heap[2 * i + 1]);
        System.out.println();
    }

}


    public static void main(String[] args) {
        MaxHP maxHeap = new MaxHP(10);
        maxHeap.insert(10);
        maxHeap.insert(4);
        maxHeap.insert(9);
        maxHeap.insert(1);
        maxHeap.insert(7);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.printMaxHeap();
        System.out.println(maxHeap.isEmpty());
        System.out.println(maxHeap.size());
    }
}
