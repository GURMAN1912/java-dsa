public class QuickSort {
    public void sort(int[] arr,int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }
    public int partition(int[] arr,int low,int high){
        int i=low,j=low;
        int pivot=arr[high];
        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public void printArray(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QuickSort ob=new QuickSort();
        int[] arr={1,5,2,10,45,33,11,53};
        int [] temp=new int[arr.length];
        ob.printArray(arr, arr.length);
        ob.sort(arr,0,arr.length-1);
        ob.printArray(arr, arr.length);
    }
    
}
