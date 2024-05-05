public class Insert {
    private Integer[] heap;
    private int n;
    public Insert(int capacity){
        heap=new Integer[capacity+1];
        n=0;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
    public void insert(int x){
        if(n==heap.length-1){
            resize(heap.length*2);
        }
        n++;
        heap[n]=x;
        swin(n);
    }
    private void swin(int k){
        while (k>1 &&heap[k]>heap[k/2]) {
            int temp=heap[k];
            heap[k]=heap[k/2];
            heap[k/2]=temp;
            k=k/2;
        }
    }
    public void resize(int size){
        Integer[] temp=new Integer[size];
        // temp[0]=null;
        for(int i=0;i<heap.length;i++){
            temp[i]=heap[i]   ;  
           }
        // n=size;
        heap=temp; 
        return;
    }
    public void levelPrint(){
        for(int i=1;i<heap.length;i++){
            System.out.print(heap[i]+" ");
        }
    }
    public static void main(String[] args) {
        Insert pq=new Insert(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        pq.insert(4);
        pq.insert(5);
        pq.insert(2);
        pq.insert(6);
        pq.insert(1);
        pq.insert(3);
        pq.levelPrint();
    }
    
}
