package Graph;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    int v ;
    static List<List<Integer>> adjList ;

    DFS(int v){
        this.v = v;
        this.adjList = new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u , int v){
        adjList.get(u).add(v);
    }

    public void DFSMain(){
        boolean visited[] =new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfsRecursive(i, visited);
            }
        }
    }

    public void dfsRecursive(int v, boolean[] visited){
        visited[v]=true;
        System.out.println(v);
      //  System.out.println("AdjList get(v)"+adjList.get(v));
        for(int u: adjList.get(v) ){
            //System.out.println("u: "+ u);
             if(!visited[u]){
                 dfsRecursive(u, visited);
             }
        }
    }
    public void DFSIterativeMain(){
        boolean[] visited=new boolean[v];
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
          //  System.out.println("\nAdjacency list of vertex" + i);
            //System.out.print(i);
            for (int j = 0; j < adjList.get(i).size(); j++) {
             //   System.out.print(" -> "+adjList.get(i).get(j));
            }
            //System.out.println();
            //System.out.println("====================================");
        }
    }
    public static void main(String[] args) {
        int v=5;
        DFS dfs = new DFS(v);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 3);
        dfs.addEdge(1, 2);
        dfs.addEdge(3, 2);
        dfs.addEdge(3, 4);
        dfs.printGraph(adjList);
        dfs.DFSMain();
        //dfs.DFSIterativeMain();
    }
}



