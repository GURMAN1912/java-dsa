public class Search {
        private ListNode head;
        private static class  ListNode {
            private int data;
            private ListNode next;     
            public ListNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        public int SearchKey(int key){
            ListNode curNode=head;
            int count=1;
            while(curNode!=null){
                if(curNode.data==key){
                    return count;
                }
                curNode=curNode.next;
                count++;
            }
            return 0;
        }
        public static void main(String[] args) {
            Search obj=new Search();
            obj.head=new ListNode(10);
            ListNode second=new ListNode(8);
            ListNode third=new ListNode(1);
            ListNode forth=new ListNode(11);
            obj.head.next=second;
            second.next=third;
            third.next=forth;
            forth.next=null;
            System.out.println("found at node position:"+obj.SearchKey(1));
        }
}
