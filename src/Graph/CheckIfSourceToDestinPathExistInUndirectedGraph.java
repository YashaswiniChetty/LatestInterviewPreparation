package Graph;

import java.util.ArrayList;
import java.util.List;

public class CheckIfSourceToDestinPathExistInUndirectedGraph {
    List<List<Integer>> graph ;
    boolean visited[];
    int nodes;
    CheckIfSourceToDestinPathExistInUndirectedGraph(int nodes){
        graph= new ArrayList<>();
        visited= new boolean[nodes];
        this.nodes= nodes;
        for(int i=0;i<nodes;i++){
            graph.add(i,new ArrayList<>());
        }
    }

    public void addEdge(int a, int b){

        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    public static void main(String[] args) {
        int n=7;
        CheckIfSourceToDestinPathExistInUndirectedGraph graph=new CheckIfSourceToDestinPathExistInUndirectedGraph(n);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(4,5);
        graph.addEdge(4,6);
        System.out.println(graph.ifSourceToDestinPathExist(0,3));



    }

    private boolean ifSourceToDestinPathExist(int source, int destin) {
        dfs(source);
        return visited[destin];
    }

    private void dfs(int source) {
        visited[source]=true;
        List<Integer> neighbourList=graph.get(source);
        for(int neighbour:neighbourList){
            if(!visited[neighbour]){
                dfs(neighbour);
            }
        }
    }
}
