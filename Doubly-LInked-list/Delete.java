
public class Delete {
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
    public Delete(){
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
    public ListNode deleteEnd(){
        if(isEmpty()){
            return null;
        }
        ListNode temp=tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.next=null;
        return temp;
    }
    public ListNode deleteFirst(){
        if(isEmpty()){
            return null;
        }
        ListNode temp=head;
        if(head==tail){
            tail=null;
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        length--;
        // head.previous=null;
        return temp;
    }
    
    public static void main(String[] args) {
        Delete list1=new Delete();
        list1.insertFirst(0);
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        System.out.println("list 1");
        list1.displayForward();
        System.out.println(list1.deleteEnd().data);
        System.out.println(list1.deleteEnd().data);
        System.out.println(list1.deleteEnd().data);
        System.out.println(list1.deleteEnd().data);
        // list1.displayForward();
        // System.out.println(list1.deleteFirst().data);
        // System.out.println(list1.deleteFirst().data);
        // System.out.println(list1.deleteFirst().data);
        // System.out.println(list1.deleteFirst().data);
        list1.displayForward();
    }
}
