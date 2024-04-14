import java.util.Scanner;

public class FimdMissingNumber {
    public static int missingNumber(int[] arr){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int num :arr){
            sum=sum-num;
        }
        return sum;
    }    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.err.println("Enter the number in the range 1 to "+(n+1));
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int f=missingNumber(arr);
        System.out.println("Missing number in array is "+f);
    }
}
