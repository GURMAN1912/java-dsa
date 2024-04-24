import java.util.Scanner;
import java.util.Stack;

public class NextGreater {
    public int[] nextGreaterElement(int[] arr){
        int[] result=new int[arr.length];
        Stack <Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while (!stack.isEmpty()&&stack.peek()<=arr[i]) {
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i]=-1;

            }
            else{
                result[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        NextGreater obj=new NextGreater();
        int[]result=obj.nextGreaterElement(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
