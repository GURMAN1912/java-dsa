public class SquareSorted {
    public int[] sort(int[] arr){
        int i=0;
        int j=arr.length-1;
        int[] result=new int[arr.length];
        for(int k=arr.length-1;k>=0;k--){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                result[k]=arr[i]*arr[i];
                i++;
            }
            else{
                result[k]=arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SquareSorted ob=new SquareSorted();
        int[] arr={-4,-1,0,3,10};
        ob.printArray(arr);
        int[] result=ob.sort(arr);
        ob.printArray(result);
    }
}
