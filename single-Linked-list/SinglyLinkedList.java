public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next; 
        public ListNode(int data){
            this.data=data;
        }
    }
    public void printList(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }
    public int listLenght(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while (current!=null) {
            count++;
            current=current.next;           
        }
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList obj=new SinglyLinkedList();
        obj.head=new ListNode(10);
        ListNode secondNode=new ListNode(11);
        ListNode thirdNode=new ListNode(12);
        ListNode forthNode=new ListNode(13);
        obj.head.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        obj.printList();
        obj.listLenght();
        System.out.println("Length of list is: "+obj.listLenght());
    }

    
}
