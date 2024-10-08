package graph;

public class MatrixGraph {
    private int E;
    private int V;
    private int[][] adjMatrix;
    public MatrixGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix= new int[nodes][nodes];

    }
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
        E++;
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
        MatrixGraph graph = new MatrixGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.printGraph();
    }

}
