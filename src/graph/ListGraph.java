package graph;

public class ListGraph {
    private int V;
    private int E;
    private Node[] adjList;
    private class Node {
        private int vertex;
        private Node next;

        public Node(int vertex, Node next) {
            this.vertex = vertex;
            this.next = next;
        }
    }

    public ListGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjList = new Node[nodes];
    }

    public void addEdge(int i, int j) {
        Node node = new Node(j, adjList[i]);
        adjList[i] = node;
        node = new Node(i, adjList[j]);
        adjList[j] = node;
        E++;
    }

    public void printGraph() {
        for (int i = 0; i < adjList.length; i++) {
            Node temp = adjList[i];
            System.out.print("Vertex " + i + " is connected to: ");
            while (temp != null) {
                System.out.print(temp.vertex + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListGraph graph = new ListGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.printGraph();
    }


}
