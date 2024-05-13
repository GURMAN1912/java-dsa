import java.util.LinkedList;

public class GraphList {
    private int V;
    private int E;
    private LinkedList<Integer>[] adj;
    public GraphList(int nodes){
        this.E=0;
        this.V=nodes;
        this.adj=new LinkedList[nodes];
        for(int i=0;i<nodes ;i++){
            this.adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(V+" Vertics "+ E +" Edge "+ " \n");
        for(int v=0;v<V;v++){
            sb.append(v+" : ");
            for(int w:adj[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        GraphList g=new GraphList(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);
    }
}
