public class HashTable {
    private HashNode buckets[];
    private int numOfBuckets;
    private int size;
    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;
        public HashNode(Integer key, String value){
            this.key=key;
            this.value=value;
        }
    }
    public HashTable(){
        this.numOfBuckets=10;
        buckets=new HashNode[10];
    }
    public HashTable(int capacity){
        this.numOfBuckets=capacity;
        buckets=new HashNode[capacity];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
     
    public static void main(String[] args) {
        HashTable table=new HashTable(10);
        System.out.println(table.size());
        System.out.println(table.isEmpty());
    }
}
