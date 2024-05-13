import java.util.LinkedList;

public class ConnectedComponents{
    private int V;
    private int E;
    private boolean[] visited;
    private int[] compId;
    private int count;
    private LinkedList<Integer>[] adj;
    public ConnectedComponents(int nodes){
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
    public void dfs(){
        visited=new boolean[V];
        compId=new int[V];
        count=0;
        for(int v=0;v<V;v++){
            if(!visited[v]){
                dfs(v);
                count++;
            }
        }
        System.out.println(count);
    }
    public void dfs(int v){
        visited[v]=true;
        compId[v]=count;
        for(int w: adj[v]){
            if(!visited[w]){
                dfs(w);
            }
        }
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
        DFS g=new DFS(5);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 2);
        g.addEdge(2, 4);
        g.dfs(0);
        System.out.println(g);
        
    }
}
