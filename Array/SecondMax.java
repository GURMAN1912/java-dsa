import java.util.Scanner;

public class SecondMax {
    public static int findSecondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }        
        int secondMax=findSecondMax(arr);
        System.out.println("Second maximum element : "+secondMax);
        
    }
}
