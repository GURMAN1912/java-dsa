import java.util.LinkedList;
import java.util.Stack;

public class ConnectedComp {
    private int V;
    private int E;
    private LinkedList<Integer>[] adj;
    public DFS(int nodes){
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
    public void dfs(int s){
        boolean[] visted=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            int u=stack.pop();
            if(!visted[u]){
                visted[u]=true;
                System.out.println(u+" ");
                for(int v:adj[u]){
                    if(!visted[v]){
                        stack.push(v);
                    }
                }
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
