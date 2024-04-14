import java.util.Scanner;

public class InsertNode {
    private ListNode head;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void firstInsert(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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

    public void inseret(int data, int position) {
        ListNode node = new ListNode(data);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode pre = head;
            int count = 1;
            while (count < position - 1) {
                pre = pre.next;
                count++;
            }
            ListNode currNode = pre.next;
            node.next = currNode;
            pre.next = node;
        }
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
        InsertNode obj = new InsertNode();
        Scanner sc = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("1 for insert at begining ");
            System.out.println("2 for insert at end");
            System.out.println("3 for inserting at a given position");
            System.out.println("4 to stop");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the vaule: ");
                    int n = sc.nextInt();
                    obj.firstInsert(n);
                    break;
                case 2:
                    System.out.println("Enter the vaule: ");
                    int n1 = sc.nextInt();
                    obj.lastInsert(n1);
                    break;
                case 3:
                    System.out.println("Enter the vaule: ");
                    System.out.println("enter the position");
                    int n2 = sc.nextInt();
                    int p = sc.nextInt();
                    obj.inseret(n2, p);
                    break;
                case 4:
                    obj.printList();

                    return;
                default:
                    System.out.println("wrong value");
                    break;
            }
            obj.printList();
        }

    }
}
