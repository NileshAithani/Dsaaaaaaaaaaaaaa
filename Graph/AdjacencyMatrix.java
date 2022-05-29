package Graph;

public class AdjacencyMatrix {
    int V,E;
    int[][]adjMatrix;

    AdjacencyMatrix(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjMatrix=new int[nodes][nodes];

    }

    public void addEdge(int u , int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices " + E + " edges "+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+":");
            for(int w : adjMatrix[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public static void main(String []args){
        AdjacencyMatrix a =new  AdjacencyMatrix(4);

        a.addEdge(0,1);
        a.addEdge(1,2);
        a.addEdge(2,3);
        a.addEdge(3,0);

        System.out.println(a);
    }
}
