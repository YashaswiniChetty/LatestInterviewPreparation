package Graph;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleInDirectedGraph {

    List<List<Integer>> graph ;
    boolean visited[], recStack[];
    int nodes;
    DetectCycleInDirectedGraph(int nodes){
        graph= new ArrayList<>();
        visited= new boolean[nodes];
        recStack=new boolean[nodes];
        this.nodes= nodes;
        for(int i=0;i<nodes;i++){
            graph.add(i,new ArrayList<>());
        }
    }

    public void addEdge(int a, int b){
        graph.get(a).add(b);
    }

    public boolean isDGHasCycle() {
        for (int i = 0; i < nodes; i++) {
            if (ifCycleExist(i)) {
                return true;
            }
        }
            return false;
        }


    public boolean ifCycleExist(int index) {
        if(recStack[index]){
            return true;
        }

        if(visited[index]){
            return false;
        }

        visited[index]=true;
        recStack[index]=true;
        List<Integer> neighborList = graph.get(index);
        for(int neighbour: neighborList){
            if(ifCycleExist(neighbour)){
                return true;
            }
        }

        recStack[index]=false;
        return false;
    }

    public static void main(String[] args) {
        int n=4;
        DetectCycleInDirectedGraph graph=new DetectCycleInDirectedGraph(n);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(0,3);
        graph.addEdge(3,2);
        System.out.println(graph.isDGHasCycle());

    }


}
