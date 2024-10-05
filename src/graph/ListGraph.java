package graph;

import java.util.LinkedList;

public class ListGraph {
    private int V;
    private int E;
    private LinkedList[] adjList;


    public ListGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjList = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            this.adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        adjList[i].add(j);
        adjList[j].add(i);
        E++;
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + "=>");
            for (Object node : adjList[i]) {
                System.out.print(node + " ");
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
