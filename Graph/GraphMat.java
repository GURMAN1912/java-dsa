public class GraphMat {
    public int V;
    public int E;
    public int[][] adjMatrix;
    public GraphMat(int nodes){
        this.adjMatrix=new int[nodes][nodes];
        this.V=nodes;
        this.E=0;
    }
    public void addEdge(int u,int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
        E++;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(V+" Vertics "+ E +" Edge "+ " \n");
        for(int v=0;v<V;v++){
            sb.append(v+" : ");
            for(int w:adjMatrix[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        GraphMat g=new GraphMat(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);
    }
    
}
