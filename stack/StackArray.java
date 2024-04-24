public class StackArray {
    private int top;
    private int[] arr;
    public StackArray(int size){
        top=-1;
        arr=new int[size];
    }
    public boolean isEmpty(){
        return top<0;
    }
    public boolean isFull(){
        return arr.length==size();
    }
    public int size(){
        return top+1;
    }
    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        top++;
        arr[top]=data;

    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        int result=arr[top];
        top--;
        return result;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");

        }
        return arr[top];
    }
    public static void main(String args[]){
        StackArray s=new StackArray(3);
        s.push(10);
        s.push(6);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }


    
}
