package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyList {
    int V,E;
    LinkedList<Integer>[]adj;


    AdjacencyList(int nodes){
        this.V=nodes;
        this.E=0;
        this.adj=new LinkedList[nodes];

        for(int v=0 ; v<V;v++){
            this.adj[v]=new LinkedList<>();
        }
    }


    public void addEdge(int u , int v){
        this.adj[v].add(u);
        this.adj[u].add(v);

        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices " + E + " edges "+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+":");
            for(int w : adj[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }



    public void bfs(int s){
        boolean [] visited =new boolean[V];
        Queue<Integer>q = new LinkedList<>();

        visited[s]=true;
        q.offer(s);

        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");

            for(int v: adj[u]){
                if(!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }
    }




    public void dfs(int s){
        boolean [] visited = new boolean[V];
        Stack<Integer>stack=new Stack<>();
        stack.push(s);

        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.print(u + " ");

                for(int v : adj[u]){
                    if(!visited[v]){
                        stack.push(v);
                    }
                }
            }
        }
    }


    public static void main(String []args){
        AdjacencyList a =new  AdjacencyList(9);

        a.addEdge(1,2);
        a.addEdge(1,3);
        a.addEdge(1,4);

        a.addEdge(2,5);

        a.addEdge(3,6);

        a.addEdge(4,7);

        a.addEdge(5,8);



        //a.bfs(1);

        a.dfs(1);
        //System.out.println(a);
    }
}
