// package stack;

import java.util.NoSuchElementException;

public class StackBasic {
    private ListNode top;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }  
    }
    public StackBasic(){
        top=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int value){
        ListNode temp=new ListNode(value);
        temp.next=top;
        top=temp;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result =top.data;
        top=top.next;
        length--;
        return result;
    }
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return top.data;
    }
    public static void main(String[] args) {
        StackBasic s=new StackBasic();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
        
}
