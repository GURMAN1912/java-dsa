public class Insert {
    private ListNode  head;
    private ListNode tail;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data=data;
        }        
    }    
    public Insert(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public void displayForward()
    {
        if(isEmpty()){
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
        
    }
    public void displayBackward(){
        if(tail==null)
            return ;
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.previous;
        }
        System.out.println("null");
    }
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            tail=newNode;
        }
        else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }
    public void insertEnd(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            head=newNode;
        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
        length++;
    }
    public void insertAfter(int prev,int value){
         ListNode prevNode=new ListNode(prev); 
        ListNode newNode=new ListNode(value);
        newNode.next=prevNode.next;
        newNode.previous=prevNode;
        prevNode.next=newNode;
        if(newNode.next!=null){
            newNode.next.previous=newNode;
        }
    }
    public static void main(String[] args) {
        Insert list1=new Insert();
        Insert list2=new Insert();
        list1.insertFirst(0);
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        System.out.println("list 1");
        list1.displayForward();
        list1.displayBackward();

        System.out.println("list 2");
        list2.insertEnd(0);
        list2.insertEnd(1);
        list2.insertEnd(2);
        list2.insertEnd(3);
        list2.displayForward();
        list2.displayBackward();

        list1.insertAfter(2, 4);
        list1.displayBackward();
    }
}
