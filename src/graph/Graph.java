package graph;

public class Graph {
    static int[][] adjMatrix;
    public Graph(int nodes) {
        this.adjMatrix= new int[nodes][nodes];
    }
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }
    public void printGraph() {
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix.length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.printGraph();
    }

}
