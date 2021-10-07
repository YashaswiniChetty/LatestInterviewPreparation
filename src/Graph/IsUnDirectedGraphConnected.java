package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IsUnDirectedGraphConnected {
    int v ;
    static List<List<Integer>> adjList ;
     static boolean[] visited;

    IsUnDirectedGraphConnected(int v){
        this.v = v;
        this.adjList = new ArrayList<>(v);
        this.visited=new boolean[v];
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u , int v){

        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void DFSIterativeMain(){

        for (int i = 0; i < v; i++) {
            if(!visited[i]){
                dfs_Iterative(i,visited);
            }
        }

    }

    public void dfs_Iterative(int v, boolean[] visited){
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v]= true;
        while(!stack.isEmpty()){
            Integer i= stack.pop();
            System.out.println(i);
            for(int u: adjList.get(i)){
                if(!visited[u]){
                    visited[u]=true;
                    stack.push(u);
                }
            }
        }

    }

    public void printGraph( List<List<Integer>> adjList){
        for(int i=0;i<adjList.size();i++){
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print(i);
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" -> "+adjList.get(i).get(j));
            }
            System.out.println();
            System.out.println("====================================");
        }
    }

    public boolean isConnected(){
        for(int i=0;i<v;i++){
            if(!visited[i]) {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=5;
        IsUnDirectedGraphConnected dfs = new IsUnDirectedGraphConnected(v);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 3);
        dfs.addEdge(1, 2);
        dfs.addEdge(3, 2);
        dfs.addEdge(3, 4);
        dfs.printGraph(adjList);
        dfs.DFSIterativeMain();
       System.out.println(dfs.isConnected());

    }
}
