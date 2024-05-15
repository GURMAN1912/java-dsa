public class HashTableRemove {
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
    public HashTableRemove(){
        this.numOfBuckets=10;
        buckets=new HashNode[10];
    }
    public HashTableRemove(int capacity){
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
    public String remove(Integer key){
        int bucketsIndex=getBucketIndex(key);
        HashNode head=buckets[bucketsIndex];
        HashNode previous=null;
        while(head!=null){
            if(head.key.equals(key)){
                break;
            }
            previous=head;
            head=head.next;
        }
        if(head==null){
            return null;

        }
        size--;
        if(previous!=null){
            previous.next=head.next;
        }
        else{
            buckets[bucketsIndex]=head.next;
        }
        return head.value;

    }
     
    public static void main(String[] args) {
        HashTableRemove table=new HashTableRemove(10);
        table.put(105, "John");
        table.put(31, "Tom");
        table.put(21, "Harry");
        System.out.println(table.remove(31));
        System.out.println(table.size());
        System.out.println(table.isEmpty());
    }
}
