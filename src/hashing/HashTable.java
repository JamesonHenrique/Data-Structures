package hashing;

public class HashTable {
    private int size;
    private int numBuckets;
    private HashNode[] buckets;
    public static class HashNode<G> {
        private Integer key;
        private G value;
        private HashNode next;

        public HashNode(Integer key, G value) {this.key = key;this.value = value;}}

    public HashTable(int capacity) {
        this.numBuckets = capacity;
        this.size = capacity;
        buckets = new HashNode[capacity];
       
    }

    public int hashFunction(int key) {
        return key % size;
    }
    public Boolean isEmpty(){ return size==0;}
    public void insert(int key, int value) {
        int index = hashFunction(key);
        HashNode head = buckets[index];
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    public Integer search(int key) {
    int index = hashFunction(key);
    HashNode head = buckets[index];
    HashNode temp = head;
    while (temp != null) {
        if (temp.key == key) {
            return (Integer) temp.value;
        }
        temp = temp.next;
    }
    return null;
}

    public void delete(int key) {
        int index = hashFunction(key);
        HashNode head = buckets[index];
        if (head.key == key) {
            buckets[index] = head.next;
            return;
        }
        HashNode prev = null;
        HashNode temp = head;
        while (temp != null) {
            if (temp.key == key) {
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            HashNode temp = buckets[i];
            System.out.print("Bucket " + i + ": ");
            while (temp != null) {
                System.out.print("[" + temp.key + ", " + temp.value + "] ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(9);
        hashTable.insert(10, 20);
        hashTable.insert(15, 25);
        hashTable.insert(20, 30);
        hashTable.insert(25, 35);
        hashTable.insert(30, 40);
        hashTable.insert(35, 45);
        hashTable.insert(40, 50);
        hashTable.insert(45, 50);
        hashTable.insert(50, 50);
        hashTable.insert(55, 50);
        hashTable.display();
        System.out.println("Value for key 20: " + hashTable.search(20));
        hashTable.delete(20);
        hashTable.display();
    }
}
