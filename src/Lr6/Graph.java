package Lr6;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    private final int maxNodes;
    private Vertex[] vertex;
    private List<Integer>[] adjacencyLists;
    private int nodeCount;

    public Graph(int maxNodes) {
        this.maxNodes = maxNodes;
        vertex = new Vertex[maxNodes];
        adjacencyLists = new LinkedList[maxNodes];
        for (int i = 0; i < maxNodes; i++) {
            adjacencyLists[i] = new LinkedList<>();
        }
        nodeCount = 0;
    }

    public void addVertex(char label) {
        vertex[nodeCount++] = new Vertex(label);
    }

    public void addEdge(int from, int to) {
        adjacencyLists[from].add(to);
        adjacencyLists[to].add(from);
    }

    public void displayVertex(int index) {
        System.out.print(vertex[index].getLabel() + " ");
    }

    public void depthFirstTraversal() {
        System.out.println("Глубинный обход графа:");
        boolean[] visited = new boolean[maxNodes];
        depthFirstSearch(0, visited, new LinkedList<>());
    }

    private void depthFirstSearch(int current, boolean[] visited, LinkedList<Integer> stack) {
        visited[current] = true;
        displayVertex(current);
        stack.push(current);
        System.out.println("Посещение " + vertex[current].getLabel() + ", Стек: " + stack);

        for (int neighbor : adjacencyLists[current]) {
            if (!visited[neighbor]) {
                depthFirstSearch(neighbor, visited, stack);
            }
        }

        stack.pop();
    }
}
