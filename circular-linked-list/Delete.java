import java.util.NoSuchElementException;

public class Delete {
    private ListNode last;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next; 
        public ListNode(int data){
            this.data=data;
        }
    }
    public Delete(){
        last=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    
    public void insertEnd(int value){
        ListNode temp=new ListNode(value);
        if(last==null){
            last=temp;
            last.next=last;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;
    }
    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp=last.next;
        if(last==last.next){
            last=null;
        }
        else{
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;

    }

    public int deleteEnd(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int item=last.data;
        ListNode temp=last.next;
        if(last.next==last){
            last=null;
            
        }
        else{
            while(temp.next!=last){
                temp=temp.next;
            }
            temp.next=last.next;
            last.next=null;
            last=temp;
        }
        return item;

    }
    public void print(){
        if(last==null){
            return ;            
        }
        ListNode first=last.next;
        while (first!=last) 
        {
            System.out.print(first.data+"-->");
            first=first.next;            
        }
        System.out.println(first.data);
    }
    public static void main(String[] args) {
        Delete list=new Delete();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.print();
        list.deleteFirst();
        list.deleteEnd();  
        list.print();
    }
    
}
