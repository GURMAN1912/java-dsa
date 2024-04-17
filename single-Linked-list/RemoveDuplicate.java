public class RemoveDuplicate {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=next;
        }
        
    }
    public void lastInsert(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode currNode = head;
        while (null != currNode.next) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public ListNode removeDulicate(){
        ListNode current=head;
        while(current!=null&& current.next!=null)
        {
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }

        return head;
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
        RemoveDuplicate obj =new RemoveDuplicate();
        obj.lastInsert(1);
        obj.lastInsert(1);
        obj.lastInsert(2);
        obj.lastInsert(3);
        obj.lastInsert(3);
        obj.printList();
        obj.head=obj.removeDulicate();
        obj.printList();

    }
}
