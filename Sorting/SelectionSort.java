public class SelectionSort {
    public void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public void printArray(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort ob=new SelectionSort();
        int[] arr={1,5,2,10,45,33,11,53};
        ob.printArray(arr, arr.length);
        ob.selectionSort(arr);
        ob.printArray(arr, arr.length);
    }
}
