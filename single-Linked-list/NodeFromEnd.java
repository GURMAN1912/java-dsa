public class NodeFromEnd {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ListNode nthListNode(int n){
        ListNode MainPtr=head;
        ListNode RefPtr=head;
        int count =0;
        while(count<n){
            RefPtr=RefPtr.next;
            count++;
        }
        while (RefPtr!=null) {
            RefPtr=RefPtr.next;
            MainPtr=MainPtr.next;            
        }
        return MainPtr;
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
        NodeFromEnd obj=new NodeFromEnd();
        obj.head=new ListNode(10);
        ListNode second=new ListNode(8);
        ListNode third=new ListNode(1);
        ListNode forth=new ListNode(11);
        obj.head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=null;
        obj.printList();
        System.out.println("nth node from last is where n=2 : "+obj.nthListNode(2).data);
    }

}
