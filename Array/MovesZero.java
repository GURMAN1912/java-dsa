import java.util.Scanner;

public class MovesZero {
    public void movesZero(int[] arr,int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0&&arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public void printArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n;
        System.out.println("Enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MovesZero obj=new MovesZero();
        // obj.printArray(arr,n);     
        System.out.println("After Moving zeros");
        obj.movesZero(arr, n);
        obj.printArray(arr,n);                
    } 
    
}
