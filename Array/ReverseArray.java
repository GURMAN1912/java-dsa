public class ReverseArray {
    public void ReverseArrayNumber(int[] arr,int start,int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;            
        }
    }
    public void printArray(int[] arr){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8};
        ReverseArray obj=new ReverseArray();
        obj.ReverseArrayNumber(arr, 0,arr.length-1 );
        obj.printArray(arr);
    }
}
