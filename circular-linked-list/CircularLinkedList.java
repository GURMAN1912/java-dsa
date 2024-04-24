public class CircularLinkedList {
    private ListNode last;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next; 
        public ListNode(int data){
            this.data=data;
        }
    }
    public CircularLinkedList(){
        last=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void createList(){
        ListNode first =new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
        ListNode forth=new ListNode(40);
        first.next=second;
        second.next=third;
        third.next=forth;
        forth.next=first;
        last=forth;
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
        CircularLinkedList list=new CircularLinkedList();
        list.createList();
        list.print();
    }
    
}
