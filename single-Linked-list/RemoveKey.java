public class RemoveKey {
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

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void removekey(int key){
        ListNode current=head;
        ListNode temp=null;
        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;
        }
        if(current==null){
            return ;
        }
        temp.next=current.next;
    }
    public static void main(String[] args) {
        RemoveKey obj =new RemoveKey();
        obj.lastInsert(1);
        obj.lastInsert(8);
        obj.lastInsert(10);
        obj.lastInsert(11);
        obj.lastInsert(16);
        obj.printList();
        obj.removekey(11);
        obj.printList();

    }
}
