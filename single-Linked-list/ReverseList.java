public class ReverseList {
    private ListNode head;
        private static class  ListNode {
            private int data;
            private ListNode next;     
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public ListNode reverse(){
            ListNode curNode=head;
            ListNode preNode=null;
            ListNode nextNode=null;
            while (curNode!=null) {
                nextNode=curNode.next;
                curNode.next=preNode;
                preNode=curNode;
                curNode=nextNode;                
            }
            return preNode;
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
            ReverseList obj=new ReverseList();
            obj.head=new ListNode(10);
            ListNode second=new ListNode(8);
            ListNode third=new ListNode(1);
            ListNode forth=new ListNode(11);
            obj.head.next=second;
            second.next=third;
            third.next=forth;
            forth.next=null;
            obj.printList();
            obj.head=obj.reverse();
            obj.printList();
            // System.out.println("found at node position:"+obj.SearchKey(1));
        }
}
