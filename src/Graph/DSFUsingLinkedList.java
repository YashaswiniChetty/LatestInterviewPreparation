package Graph;

import java.util.LinkedList;
import java.util.List;

public class DSFUsingLinkedList {
    List<Integer>[] graph;
    int nodes;
    DSFUsingLinkedList(int nodes){
        this.nodes=nodes;
        graph= new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            graph[i]=new LinkedList<>();
        }
    }

    public void addEdge(int a, int b){
        graph[a].add(b);
    }

    public void DFSMain(){
        boolean visited[] = new boolean[nodes];
        for(int i=0;i<nodes;i++){
            if(!visited[i]){
                dfs(i, visited);
            }
        }
    }

    public void dfs(int index , boolean[] visited){
        visited[index]=true;
        System.out.println(index);
        List<Integer> neighbourList= graph[index];
        for(int neighbour:neighbourList){
            if(!visited[neighbour]){
                dfs(neighbour, visited);
            }
        }

    }

    public static void main(String[] args) {
        int v=5;
        DSFUsingLinkedList dfs = new DSFUsingLinkedList(v);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 3);
        dfs.addEdge(1, 2);
        dfs.addEdge(3, 2);
        dfs.addEdge(3, 4);
         dfs.DFSMain();

    }
}
