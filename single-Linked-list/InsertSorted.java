public class InsertSorted {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
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
    public ListNode insertSorted(int value){
        ListNode  newNode=new ListNode(value);
        ListNode  current=head;
        ListNode temp=null;
        while(current!=null &&current.data<newNode.data){
            temp=current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;
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
        InsertSorted obj =new InsertSorted();
        obj.lastInsert(1);
        obj.lastInsert(8);
        obj.lastInsert(10);
        obj.lastInsert(13);
        obj.lastInsert(16);
        obj.printList();
        obj.head=obj.insertSorted(11);
        obj.printList();

    }
}
