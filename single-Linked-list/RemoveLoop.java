public class RemoveLoop {
    private ListNode head;
    private class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data ){
            this.data=data;
            this.next=null;
        }   
        
    }
    public void removeLoop(ListNode slowPtr){
        // ListNode prNode=slowPtr;
        ListNode temp=head;
        while(slowPtr.next!=temp.next){
            // prNode=slowPtr;
            slowPtr=slowPtr.next;
            temp=temp.next;
        }
        slowPtr.next=null;
     }
    public void detectLoop(){
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(fastPtr==slowPtr){
                removeLoop(slowPtr);
                return; 
                
            }
        }
        // return null;
    }
    public void loopList(){
        ListNode first =new ListNode(1);
        ListNode second =new ListNode(2);
        ListNode third =new ListNode(3);
        ListNode forth =new ListNode(4);
        ListNode fifth =new ListNode(5);
        ListNode sixth =new ListNode(6);
        head=first;
        first.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;
    }
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        RemoveLoop obj=new RemoveLoop();
        obj.loopList();
        // obj.printList();
        System.out.println(obj.head);
        obj.detectLoop();
        obj.printList();
    }

    
}
