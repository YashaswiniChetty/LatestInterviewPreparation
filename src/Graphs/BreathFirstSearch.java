package Graphs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph{
    int v;
    private List<LinkedList<Integer>> adjList;

    public  Graph(int v){
        this.v=v;
        adjList=new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public  void addEdage(int u,int v){
        adjList.get(u).add(v);
        /*adjList.get(v).add(u) */ //in case undirected graph
    }

    public void BFS_Traversal(int start){
        System.out.println("BFS Traversal of the graph is : ");
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[v];
        queue.add(start);
        visited[start]=true;
        while (!queue.isEmpty()){
            Integer v = queue.poll();
            System.out.print(v+"->");
            for (int u: adjList.get(v)) {
                if(!visited[u]) {
                    queue.add(u);
                    visited[u] = true;
                }
            }
        }
    }


}
public class BreathFirstSearch {
    public static void main(String[] args) {

        int v=5;
        Graph bfsTraversal=new Graph(v);
        bfsTraversal.addEdage(0,1);
        bfsTraversal.addEdage(0,3);
        bfsTraversal.addEdage(1,2);
        bfsTraversal.addEdage(3,2);
        bfsTraversal.addEdage(3,4);

        bfsTraversal.BFS_Traversal(0);

    }
}
