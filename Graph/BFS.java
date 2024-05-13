import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class BFS {
    private int V;
    private int E;
    private LinkedList<Integer>[] adj;
    public BFS(int nodes){
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
    public void bfs(int s){
        boolean[] visted=new boolean[V];
        Queue <Integer> q=new LinkedList<>();
        visted[s]=true;
        q.offer(s);
        while (!q.isEmpty()) {
            int u=q.poll();
            System.out.print(u+" ");            
            for(int v:adj[u]){
                if(!visted[v]){visted[v]=true;q.offer(v);}                
            }
        }
        System.out.println();
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
        BFS g=new BFS(5);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 2);
        g.addEdge(2, 4);
        g.bfs(0);
        System.out.println(g);
        
    }
}
