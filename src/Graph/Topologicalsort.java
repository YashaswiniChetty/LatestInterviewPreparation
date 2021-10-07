package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Topologicalsort {
    int v ;
    static List<List<Integer>> adjList ;

    Topologicalsort(int v){
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
        Stack<Integer> stack = new Stack<>();
        boolean visited[] =new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfsRecursive(i, visited, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public void dfsRecursive(int v, boolean[] visited, Stack<Integer> stack){
        visited[v]=true;
        for(int u: adjList.get(v) ){
            if(!visited[u]){
                dfsRecursive(u, visited, stack);
            }
        }
        stack.push(v);
        System.out.println();

    }





    public static void main(String[] args) {
        int v=5;
        Topologicalsort dfs = new Topologicalsort(v);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 3);
        dfs.addEdge(0, 4);
        dfs.addEdge(1, 2);
        dfs.addEdge(4, 2);
        dfs.addEdge(3, 4);
        dfs.DFSMain();
    }
}
