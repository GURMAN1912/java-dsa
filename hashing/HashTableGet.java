public class HashTableGet {
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
    public HashTableGet(){
        this.numOfBuckets=10;
        buckets=new HashNode[10];
    }
    public HashTableGet(int capacity){
        this.numOfBuckets=capacity;
        buckets=new HashNode[capacity];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getBucketIndex(Integer key){
        return key%buckets.length;
    }
    public void put(Integer key,String value){
        int bucketsIndex=getBucketIndex(key);
        HashNode head=buckets[bucketsIndex];
        while(head!=null){
            if(head.key==key){
                head.value=value;
                return;
            }
            head=head.next;
        }
        size++;
        head=buckets[bucketsIndex];
        HashNode node=new HashNode(key, value);
        node.next=head;
        buckets[bucketsIndex]=node;
    }

    public String get(Integer key){
        int bucketsIndex=getBucketIndex(key);
        HashNode head=buckets[bucketsIndex];
        while (head!=null) {
            if(head.key.equals(key))
            {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
     
    public static void main(String[] args) {
        HashTableGet table=new HashTableGet(10);
        table.put(105, "John");
        table.put(31, "Tom");
        table.put(21, "Harry");
        System.out.println(table.get(21));
        System.out.println(table.size());
        System.out.println(table.isEmpty());
    }
}
