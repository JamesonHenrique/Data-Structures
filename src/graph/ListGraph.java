package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListGraph {
    private int V;
    private int E;
    private LinkedList<Integer> []adjList;


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
    public void bfs(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.offer(s);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : adjList[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
    }
    public void dfs(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        visited[s] = true;
        while (!stack.isEmpty()) {
            int u = stack.pop();
            System.out.print(u + " ");
            for (int v : adjList[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    stack.push(v);
                }
            }
        }
    }


    public void dfsRecursive(int s) {
        boolean[] visited = new boolean[V];
        dfsRecursive(s, visited);
    }

    private void dfsRecursive(int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int v : adjList[s]) {
            if (!visited[v]) {
                dfsRecursive(v, visited);
            }
        }
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
        ListGraph graph = new ListGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(4, 2);
        graph.printGraph();
        System.out.println("BFS");
        graph.bfs(0);
        System.out.println();
        System.out.println("DFS");
        graph.dfs(0);
        System.out.println();
        System.out.println("DFS Recursive");
        graph.dfsRecursive(0);
    }


}
