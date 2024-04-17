public class DeleteNode {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next; 
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }
    public ListNode deleteLast(){
        if(head==null|| head.next==null){
            return head;
        }
        ListNode pre=null;
        ListNode currNode=head;
        while(currNode.next!=null){
            pre=currNode;
            currNode=currNode.next;
        }
        pre.next=null;
        return currNode;
    }
    public ListNode delete(int position){
        ListNode currNode=head;
        if(position==1){
            head=head.next;
            return currNode;
        }
        else{
            int count =1;
            ListNode pre=null;
            while(count<position){
                pre=currNode;
                currNode=currNode.next;
                count++;
            }
            pre.next=currNode.next;
            currNode.next=null;
            return currNode;
        }
    }

    public void printList(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public static void main(String[] args) {
        DeleteNode obj=new DeleteNode();
        obj.head=new ListNode(10);
        ListNode secondNode=new ListNode(11);
        ListNode thirdNode=new ListNode(12);
        ListNode forthNode=new ListNode(13);
        obj.head.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        System.out.println(obj.delete(4).data);

        obj.printList();
    }

    
}
