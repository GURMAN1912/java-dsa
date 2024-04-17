public class DetectLoop {
    private ListNode head;
    private class  ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
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
    public ListNode detectLoop(){
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }
    public ListNode getStartingNode(ListNode slowPtr){
        ListNode temp=head;
        while(slowPtr !=temp){
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        return temp;
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
            DetectLoop obj=new DetectLoop();
            obj.loopList();
            // obj.printList();
            System.out.println(obj.detectLoop().data);
        }
        
}
