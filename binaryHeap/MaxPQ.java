public class MaxPQ {
    private Integer[] heap;
    private int n;
    public MaxPQ(int capacity){
        heap=new Integer[capacity+1];
        n=0;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
    public void resize(int size){
        Integer[] temp=new Integer[size];
        temp[0]=null;
        for(int i=1;i<n;i++){
            temp[i]=heap[i]   ;     }
        heap=temp; 
        return;
    }
    public static void main(String[] args) {
        MaxPQ pq=new MaxPQ(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
    }
    
}
