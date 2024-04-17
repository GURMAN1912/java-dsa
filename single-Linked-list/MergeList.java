public class MergeList {
    private ListNode head;
    private static class  ListNode {
        private int data;
        private ListNode next;       
        public ListNode (int data){
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
    public static ListNode merge(ListNode a,ListNode b){
        ListNode dummy= new ListNode(0);
        ListNode tail=dummy;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null){
            tail.next=b;
        }
        else{
            tail.next=a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeList list1=new MergeList();
        MergeList list2=new MergeList();
        list1.lastInsert(1);
        list1.lastInsert(4);
        list1.lastInsert(8);

        list2.lastInsert(3);
        list2.lastInsert(6);

        list1.printList();
        list2.printList();
        MergeList result=new MergeList();
        result.head=merge(list1.head,list2.head);
        result.printList();
    }
}
