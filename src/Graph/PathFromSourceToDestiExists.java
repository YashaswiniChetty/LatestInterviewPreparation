package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathFromSourceToDestiExists {
    int v;
    List<List<Integer>> adjList ;
    boolean visited[];
    PathFromSourceToDestiExists(int v){
        this.v=v;
        this.adjList= new ArrayList<>();
       visited= new boolean[v];
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void dfsIteMain(){

        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfsIte(i, visited);
            }
        }
    }

    public void dfsIte(int v, boolean []visited){
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v]=true;
        while(!stack.isEmpty()){
            int u = stack.pop();
            System.out.println(u);
            for(int i:adjList.get(u)){
                if(!visited[i]){
                    stack.push(i);
                    visited[i]=true;
                }
            }
        }
    }

    public boolean isPathExist(int u, int v){
        dfsIte(u, visited);
       return visited[v];
    }
    public static void main(String[] args) {
        int v=8;
        PathFromSourceToDestiExists dfs = new PathFromSourceToDestiExists(v);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(3, 5);
        dfs.addEdge(7, 6);
        // dfs.DFSMain();
        //dfs.dfsIteMain();
        System.out.println(dfs.isPathExist(0, 5));
    }
}
