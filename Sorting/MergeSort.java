public class MergeSort {
    public void mergeSort(int[] arr,int[] temp,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid+1, high);
            merge(arr, temp, low,mid, high);
        }
    }
    private void merge(int[] arr,int[] temp,int low,int mid ,int high){
        for (int i = low; i <= high; i++) {
            temp[i]=arr[i];            
        }
        int i=low,j=mid+1;
        int k=low;
        while (i<=mid&& j<=high) {
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }
            else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            arr[k]=temp[i];
            k++;
            i++;
        }
    }
    public void printArray(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MergeSort ob=new MergeSort();
        int[] arr={1,5,2,10,45,33,11,53};
        int [] temp=new int[arr.length];
        ob.printArray(arr, arr.length);
        ob.mergeSort(arr,new int[arr.length],0,arr.length-1);
        ob.printArray(arr, arr.length);
    }
    
}
