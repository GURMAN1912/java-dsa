// import javax.smartcardio.CardPermission;

public class AddList{
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
    public static ListNode Add(ListNode a,ListNode b){
        ListNode dummyNode=new ListNode(0);
        ListNode tail=dummyNode;
        int carry=0;
        while (a!=null ||b!=null) {
            int x=(a!=null)?a.data:0;
            int y=(b!=null)?b.data:0;
            int sum=carry+x+y;
            carry=sum/10;
            tail.next=new ListNode(sum%10 );
            tail=tail.next;
            if(a!=null) a=a.next;
            if(b!=null) b=b.next;            
        }
        if(carry>0){
            tail.next=new ListNode(carry);
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        AddList list1=new AddList();
        AddList list2=new AddList();
        list1.lastInsert(5);
        list1.lastInsert(6);
        list1.lastInsert(4);

        list2.lastInsert(3);
        list2.lastInsert(4);
        list2.lastInsert(3);

        list1.printList();
        list2.printList();
        AddList result=new AddList();
        result.head=Add(list1.head,list2.head);
        result.printList();
    }
}
