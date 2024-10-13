package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Topologicalsort {

    List<List<Integer>> graph;
    int nodes;
    Topologicalsort(int nodes){
        graph= new ArrayList<>();
        this.nodes=nodes;
        for(int i=0;i<nodes;i++){
            graph.add(i,new ArrayList<>());
        }
    }

    public void addEdge(int a , int b){
        graph.get(a).add(b);
    }

    public void toplogicalSortUtil(int index, boolean[] visited,Stack<Integer> stack){
        visited[index] = true;
        List<Integer> neighbourList= graph.get(index);
        for(int neighbour: neighbourList){
            if(!visited[neighbour])
                toplogicalSortUtil(neighbour, visited, stack);
        }
        stack.push(index);
    }

    public void topoSort(){
        boolean[] visited = new boolean[nodes];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nodes; ++i)
            if(!visited[i])
                toplogicalSortUtil(i, visited, stack);

        while(!stack.empty())
            System.out.println(stack.pop());
    }

    public static void main(String []args){
        Topologicalsort G = new Topologicalsort(5);
        G.addEdge(0,1);
        G.addEdge(0,3);
        G.addEdge(0,4);
        G.addEdge(1,2);
        G.addEdge(4,2);
        G.addEdge(3,4);
        G.topoSort();
    }

}
