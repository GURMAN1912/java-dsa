public class BubbleSort {
    public void bubbleSort(int[] arr,int n){
        boolean isSwapped;
        for (int i = 0; i < n-1; i++) {
            isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }            
            if(!isSwapped) return;
        }
    }
    public void printArray(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        BubbleSort ob=new BubbleSort();
        int[] arr={1,5,2,10,45,33,11,53};
        ob.printArray(arr, arr.length);
        ob.bubbleSort(arr,arr.length);
        ob.printArray( arr,arr.length   );
    }    
}
