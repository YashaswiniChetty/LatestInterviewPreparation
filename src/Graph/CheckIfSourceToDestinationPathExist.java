package Graph;

import java.util.ArrayList;
import java.util.List;

public class CheckIfSourceToDestinationPathExist {
    List<List<Integer>> graph ;
    boolean visited[];
    int nodes;
    CheckIfSourceToDestinationPathExist(int nodes){
        graph= new ArrayList<>();
        visited= new boolean[nodes];
        this.nodes= nodes;
        for(int i=0;i<nodes;i++){
            graph.add(i,new ArrayList<>());
        }
    }

    public void addEdge(int a, int b){
        graph.get(a).add(b);
    }

    public static void main(String[] args) {
        int n=5;
        CheckIfSourceToDestinationPathExist graph=new CheckIfSourceToDestinationPathExist(n);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(3,2);
        graph.addEdge(3,0);
        graph.addEdge(2,4);
        System.out.println(graph.ifSourceToDestinPathExist(0,3));
        System.out.println(graph.ifSourceToDestinPathExist(0,2));


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
