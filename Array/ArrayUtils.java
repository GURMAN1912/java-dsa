public class ArrayUtils {
    public void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void demoArray(){
        int[] arr=new int[4];
        arr[0]=5;
        arr[1]=2;
        arr[2]=3;
        arr[3]=6;
        printArray(arr);
        arr[2]=66;
        printArray(arr);
    }
    public static void main(String args[]){
        ArrayUtils arrUtils=new ArrayUtils();
        arrUtils.demoArray();
    }        
}
