public class InsertionSOrt {
    public void insertionSort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public void printArray(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        InsertionSOrt ob=new InsertionSOrt();
        int[] arr={1,5,2,10,45,33,11,53};
        ob.printArray(arr, arr.length);
        ob.insertionSort(arr,arr.length);
        ob.printArray( arr,arr.length   );
    }   
}
