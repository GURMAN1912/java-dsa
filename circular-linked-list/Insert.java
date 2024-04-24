public class Insert {
    private ListNode last;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next; 
        public ListNode(int data){
            this.data=data;
        }
    }
    public Insert(){
        last=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void InsertFirst(int value)
    {
        ListNode temp=new ListNode(value);
        if(last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }
    public void insertEnd(int value){
        ListNode temp=new ListNode(value);
        if(last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;
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
        Insert list=new Insert();
        list.InsertFirst(0);
        list.InsertFirst(1);
        list.InsertFirst(2);
        list.print();
        list.insertEnd(-1);
        list.insertEnd(-2);
        list.insertEnd(-3);
        list.print();
    }
    
}
