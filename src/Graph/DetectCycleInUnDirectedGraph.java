package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DetectCycleInUnDirectedGraph {
    int v;
    List<List<Integer>> adjList ;

    public DetectCycleInUnDirectedGraph(int v) {
        this.v = v;
        this.adjList= new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int u , int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void DFSMianRecursion(){
        boolean visited[]= new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfs_rec(i, visited);
            }
        }
    }

    public void dfs_rec(int v, boolean[] visited){
        visited[v]=true;
        System.out.println(v);
        for(int u:adjList.get(v)){
            if(!visited[u]){
                dfs_rec(u,visited);
            }
        }
    }
    public void DFSMianIterative(){
        boolean visited[]= new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfs_ite(i, visited);
            }
        }
    }

    public void dfs_ite(int v, boolean[] visited){
        Stack<Integer> stack =  new Stack<>();
        stack.push(v);
        visited[v]=true;
        while(!stack.isEmpty()){
            int i= stack.pop();
            System.out.println(i);
            for(int u: adjList.get(i)){
                if(!visited[u]){
                    stack.push(u);
                    visited[u]=true;
                }
            }
        }
    }

    public boolean isCyclic(){
        boolean visited[] = new boolean[v];

        for(int i=0;i<v;i++) {
            if (!visited[i]) {
                if (dfscycle(i, -1, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfscycle(int index, int parent, boolean[] visited){
        visited[index]= true;
        for(int u:adjList.get(index)){
            if(!visited[u]){
                dfscycle(u,index, visited);
            }else if(u!=parent){
               return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int v=5;
        DetectCycleInUnDirectedGraph graph = new DetectCycleInUnDirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);
       // graph.DFSMianRecursion();
        graph.isCyclic();
    }
}
