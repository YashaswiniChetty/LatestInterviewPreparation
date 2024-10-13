package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class KosarajuStronglyConnectedraph {
   /* List<List<Integer>> graph ;
    KosarajuStronglyConnectedraph reverseGraph;
    boolean visited[], recStack[];
    int nodes;
    KosarajuStronglyConnectedraph(int nodes){
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

    public static void main(String[] args) {
        KosarajuStronglyConnectedraph G = new KosarajuStronglyConnectedraph(9);
        G.addEdge(0,1);
        G.addEdge(1,2);
        G.addEdge(2,3);
        G.addEdge(3,0);
        G.addEdge(2,4);
        G.addEdge(4,5);
        G.addEdge(5,6);
        G.addEdge(6,4);
        G.addEdge(7,6);
        G.addEdge(7,8);

        G.SCC();
    }

    public void SCC() {
        //topo sort
        boolean visited[]= new boolean[nodes];
        Stack<Integer> stack =  new Stack<>();
        for(int i=0;i<nodes;i++){
            if(!visited[i]){
                topoSortUtil(i, visited, stack);
            }
        }
        //reset visited to false;
        for(int i=0;i<nodes;i++){
            visited[i]=false;
        }
        //reverse the graph
       reverseGraph = reverseGraph();
        while(!stack.empty()){
            int v = stack.pop();
            if(!visited[v]){
                reverseGraph.dDFSfs(visited, v);
                System.out.println();
            }
        }

    }

   private void dDFSfs(boolean[] visited, int s){
        visited[s] = true;
        System.out.print(s + " ");
        for(int u: graph.get(s))
            if(!visited[u]) dDFSfs(visited, u);
    }

    public  KosarajuStronglyConnectedraph reverseGraph() {
        KosarajuStronglyConnectedraph reverse= new KosarajuStronglyConnectedraph(nodes);
        for(int  i=0;i<nodes;i++){

            for(int neighbour: graph.get(i)){
                reverse.addEdge(neighbour, i);
            }
        }
        return reverseGraph;
    }

    public void topoSortUtil(int i, boolean[] visited, Stack<Integer> stack) {
        visited[i]=true;
        List<Integer> neighbourList= graph.get(i);
        for(int neighbour:neighbourList){
            if(!visited[neighbour]){
                topoSortUtil(neighbour, visited, stack);
            }
        }
        stack.push(i);
    }*/
   List<Integer>[] graph;
    int nodes;
    KosarajuStronglyConnectedraph(int nodes){
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
        System.out.print(index + " ");
        List<Integer> neighbourList= graph[index];
        for(int neighbour:neighbourList){
            if(!visited[neighbour]){
                dfs(neighbour, visited);
            }
        }

    }
    public void SSC(){
        //topo sort
        boolean visited[] = new boolean[nodes];
        Stack<Integer> stack =  new Stack<>();
        for(int i=0;i<nodes;i++){
            if(!visited[i]){
                topoSortUtil(i, visited, stack);
            }
        }

        //reset visited to false
        for(int i = 0; i < nodes; ++i)
            visited[i] = false;
        //reverse graph
        KosarajuStronglyConnectedraph reverseGraph = reverseGraph();
        while(!stack.isEmpty()){
            int i = stack.pop();
            if(!visited[i]){
                reverseGraph.dfs(i, visited);
                System.out.println();
            }
        }
    }
    private KosarajuStronglyConnectedraph reverseGraph() {
        KosarajuStronglyConnectedraph reverseGraph = new KosarajuStronglyConnectedraph(nodes);
        for (int i = 0; i < nodes; ++i)
            for (int neighbour : graph[i])
                reverseGraph.graph[neighbour].add(i);
        return reverseGraph;
    }
    public void topoSortUtil(int index, boolean [] visited, Stack<Integer> stack){
        visited[index]=true;
        List<Integer> neighbourList= graph[index];
        for(int neighbour: neighbourList){
            if(!visited[neighbour]){
                topoSortUtil(neighbour, visited, stack);
            }
        }
        stack.push(index);
    }

    public static void main(String[] args) {

        KosarajuStronglyConnectedraph G = new KosarajuStronglyConnectedraph(9);
        G.addEdge(0,1);
        G.addEdge(1,2);
        G.addEdge(2,3);
        G.addEdge(3,0);
        G.addEdge(2,4);
        G.addEdge(4,5);
        G.addEdge(5,6);
        G.addEdge(6,4);
        G.addEdge(7,6);
        G.addEdge(7,8);
        G.SSC();

    }
}
