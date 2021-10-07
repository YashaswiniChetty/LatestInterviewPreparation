package Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphRepresentation {

    public static void main(String[] args) {
        int v=5;
        List<List<Integer>> adjList = new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        GraphRepresentation graph = new GraphRepresentation();
        graph.addAdge(0, 1, adjList);
        graph.addAdge(0, 3, adjList);
        graph.addAdge(1, 2, adjList);
        graph.addAdge(3, 2, adjList);
        graph.addAdge(3, 4, adjList);
        graph.printGraph(adjList);

    }

    public void addAdge(int u , int v ,  List<List<Integer>> adjList){
          adjList.get(u).add(v);
          //adjList.get(v).add(u);
    }

    public void printGraph( List<List<Integer>> adjList){
        for(int i=0;i<adjList.size();i++){
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print(i);
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" -> "+adjList.get(i).get(j));
            }
            System.out.println();
        }
    }
}
