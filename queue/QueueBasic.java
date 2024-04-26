// package queue;

public class QueueBasic {
    private ListNode front;
    private ListNode rear;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }   
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public void enqueue(int data){
        ListNode temp=new ListNode(data);
        if(isEmpty()){
            front=temp;
        }
        else{
        rear.next=temp;        }
        rear=temp;
        length++;
    }
    public ListNode dequeue(){
        ListNode temp=front;
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        if(rear==front){
            front=rear=temp;
        }
        else{
            front=front.next;
        }
        length--;
        return temp;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Empty");

        }
        ListNode temp=front ;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        QueueBasic q=new QueueBasic();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.print();
        q.dequeue();
        q.dequeue();
        q.print();
    }
     
}
